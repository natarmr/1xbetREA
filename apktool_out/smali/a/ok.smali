.class public final La/ok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ok;->a:B

    iput-object p1, p0, La/ok;->b:La/cp;

    iput-object p2, p0, La/ok;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const v4, 0x7f0606a8

    .line 19
    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    move-object p1, v2

    .line 24
    check-cast p1, La/tfh;

    .line 25
    .line 26
    iget-object p1, p1, La/tfh;->d:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/yfh;

    .line 33
    .line 34
    iget-object v0, v0, La/yfh;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    check-cast v2, La/tfh;

    .line 40
    .line 41
    iget-object p1, v2, La/tfh;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 42
    .line 43
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/yfh;

    .line 48
    .line 49
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setBackgroundResource(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/plc;->w(La/cp;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast v2, Ljava/util/Collection;

    .line 79
    .line 80
    check-cast v2, Ljava/lang/Iterable;

    .line 81
    .line 82
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, La/xfh;

    .line 101
    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    instance-of v2, p1, La/wfh;

    .line 105
    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    move-object p1, v1

    .line 109
    check-cast p1, La/tfh;

    .line 110
    .line 111
    iget-object p1, p1, La/tfh;->d:Landroid/widget/TextView;

    .line 112
    .line 113
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    check-cast v2, La/yfh;

    .line 118
    .line 119
    iget-object v2, v2, La/yfh;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_2
    instance-of v2, p1, La/ufh;

    .line 126
    .line 127
    if-eqz v2, :cond_3

    .line 128
    .line 129
    move-object p1, v1

    .line 130
    check-cast p1, La/tfh;

    .line 131
    .line 132
    iget-object p1, p1, La/tfh;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 133
    .line 134
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, La/yfh;

    .line 139
    .line 140
    invoke-virtual {p1, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setBackgroundResource(I)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    instance-of p1, p1, La/vfh;

    .line 145
    .line 146
    if-eqz p1, :cond_4

    .line 147
    .line 148
    invoke-static {v0}, La/plc;->w(La/cp;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 153
    .line 154
    .line 155
    const/4 p0, 0x0

    .line 156
    return-object p0

    .line 157
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0
.end method

.method private final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->b:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    check-cast p0, La/wqo;

    .line 20
    .line 21
    iget-object p0, p0, La/wqo;->b:Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->setButtonsVisibile(Z)V

    .line 25
    .line 26
    .line 27
    move-object p0, v1

    .line 28
    check-cast p0, La/wqo;

    .line 29
    .line 30
    iget-object v3, p0, La/wqo;->b:Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;

    .line 31
    .line 32
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, La/vqo;

    .line 37
    .line 38
    iget-object v4, v4, La/vqo;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->setTitle(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const v3, 0x7f0809a9

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object v4, La/j5d;->a:Landroid/util/TypedValue;

    .line 54
    .line 55
    const v4, 0x7f040b0b

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v4, p1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-static {v3, v2, p1}, La/vcc;->c0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, La/wqo;->b:Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;

    .line 66
    .line 67
    invoke-virtual {p0, v3}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->setBonusIcon(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    check-cast v1, La/wqo;

    .line 71
    .line 72
    iget-object p0, v1, La/wqo;->b:Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;

    .line 73
    .line 74
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, La/vqo;

    .line 79
    .line 80
    iget-object p1, p1, La/vqo;->d:La/uqo;

    .line 81
    .line 82
    iget-object p1, p1, La/uqo;->a:La/chl0;

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->setMarket(La/chl0;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v1, Ljava/util/Collection;

    .line 111
    .line 112
    check-cast v1, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/uqo;

    .line 133
    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 137
    .line 138
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 139
    .line 140
    check-cast v1, La/wqo;

    .line 141
    .line 142
    iget-object v1, v1, La/wqo;->b:Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;

    .line 143
    .line 144
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, La/vqo;

    .line 149
    .line 150
    iget-object v0, v0, La/vqo;->d:La/uqo;

    .line 151
    .line 152
    iget-object v0, v0, La/uqo;->a:La/chl0;

    .line 153
    .line 154
    invoke-virtual {v1, v0}, Lorg/xplatform/feature/dayexpress/impl/presentation/view/ExpressCardBottomView;->setMarket(La/chl0;)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    const/4 p0, 0x0

    .line 162
    return-object p0

    .line 163
    :cond_4
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object p0
.end method

.method private final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->b:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    check-cast p0, La/o7b0;

    .line 20
    .line 21
    iget-object p0, p0, La/o7b0;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d()Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/fcb;

    .line 32
    .line 33
    iget-wide p0, p0, La/fcb;->a:J

    .line 34
    .line 35
    const-wide/16 v3, 0x0

    .line 36
    .line 37
    cmp-long v3, p0, v3

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    const-string v3, "svg"

    .line 42
    .line 43
    const-string v4, "sports_v2"

    .line 44
    .line 45
    const-string v5, "static"

    .line 46
    .line 47
    invoke-static {v5, v3, v4}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    const-string v4, ".svg"

    .line 52
    .line 53
    invoke-static {p0, p1, v4, v3}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, v3, La/bzu;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    :goto_0
    move-object v3, p0

    .line 65
    goto :goto_1

    .line 66
    :cond_0
    const-string p0, ""

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_1
    const/4 v8, 0x0

    .line 70
    const/16 v9, 0x1fc

    .line 71
    .line 72
    const v4, 0x7f08080a

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-static/range {v2 .. v9}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 79
    .line 80
    .line 81
    check-cast v1, La/o7b0;

    .line 82
    .line 83
    iget-object p0, v1, La/o7b0;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 84
    .line 85
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, La/fcb;

    .line 90
    .line 91
    iget-object p1, p1, La/fcb;->b:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, La/jcb;->J(La/cp;)V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_2

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    check-cast v1, Ljava/util/Collection;

    .line 123
    .line 124
    check-cast v1, Ljava/lang/Iterable;

    .line 125
    .line 126
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, La/dcb;

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    instance-of v1, v0, La/bcb;

    .line 149
    .line 150
    iget-object v2, p0, La/ok;->c:La/cp;

    .line 151
    .line 152
    if-eqz v1, :cond_3

    .line 153
    .line 154
    invoke-static {v2}, La/jcb;->J(La/cp;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_3
    instance-of v0, v0, La/ccb;

    .line 159
    .line 160
    if-eqz v0, :cond_4

    .line 161
    .line 162
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 163
    .line 164
    check-cast v0, La/o7b0;

    .line 165
    .line 166
    iget-object v0, v0, La/o7b0;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 167
    .line 168
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    check-cast v1, La/fcb;

    .line 173
    .line 174
    iget-object v1, v1, La/fcb;->b:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 181
    .line 182
    .line 183
    const/4 p0, 0x0

    .line 184
    return-object p0

    .line 185
    :cond_5
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    move-object p1, v2

    .line 24
    check-cast p1, La/z3b0;

    .line 25
    .line 26
    iget-object p1, p1, La/z3b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 27
    .line 28
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/zgb;

    .line 33
    .line 34
    iget-boolean v0, v0, La/zgb;->f:Z

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setFavoriteIcon(Z)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, La/ahb;->w(La/cp;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v2

    .line 43
    check-cast p1, La/z3b0;

    .line 44
    .line 45
    iget-object p1, p1, La/z3b0;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 46
    .line 47
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/zgb;

    .line 52
    .line 53
    iget-object v0, v0, La/zgb;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    move-object p1, v2

    .line 59
    check-cast p1, La/z3b0;

    .line 60
    .line 61
    iget-object p1, p1, La/z3b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 62
    .line 63
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, La/zgb;

    .line 68
    .line 69
    iget v0, v0, La/zgb;->i:I

    .line 70
    .line 71
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setCounterNumber(Ljava/lang/Integer;)V

    .line 76
    .line 77
    .line 78
    move-object p1, v2

    .line 79
    check-cast p1, La/z3b0;

    .line 80
    .line 81
    iget-object p1, p1, La/z3b0;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 82
    .line 83
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, La/zgb;

    .line 88
    .line 89
    iget-object v0, v0, La/zgb;->g:La/vf5;

    .line 90
    .line 91
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->setBadge(La/vf5;)V

    .line 92
    .line 93
    .line 94
    check-cast v2, La/z3b0;

    .line 95
    .line 96
    iget-object p1, v2, La/z3b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 97
    .line 98
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/zgb;

    .line 103
    .line 104
    iget-boolean p0, p0, La/zgb;->k:Z

    .line 105
    .line 106
    if-nez p0, :cond_0

    .line 107
    .line 108
    move v4, v5

    .line 109
    :cond_0
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    check-cast v2, Ljava/util/Collection;

    .line 137
    .line 138
    check-cast v2, Ljava/lang/Iterable;

    .line 139
    .line 140
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_9

    .line 153
    .line 154
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, La/ygb;

    .line 159
    .line 160
    if-eqz p1, :cond_8

    .line 161
    .line 162
    instance-of v2, p1, La/vgb;

    .line 163
    .line 164
    if-eqz v2, :cond_3

    .line 165
    .line 166
    move-object p1, v1

    .line 167
    check-cast p1, La/z3b0;

    .line 168
    .line 169
    iget-object p1, p1, La/z3b0;->c:Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;

    .line 170
    .line 171
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, La/zgb;

    .line 176
    .line 177
    iget-object v2, v2, La/zgb;->d:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_cell/middle/SportCellMiddleView;->setTitleText(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_3
    instance-of v2, p1, La/xgb;

    .line 184
    .line 185
    if-eqz v2, :cond_4

    .line 186
    .line 187
    move-object p1, v1

    .line 188
    check-cast p1, La/z3b0;

    .line 189
    .line 190
    iget-object p1, p1, La/z3b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 191
    .line 192
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    check-cast v2, La/zgb;

    .line 197
    .line 198
    iget-boolean v2, v2, La/zgb;->f:Z

    .line 199
    .line 200
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setFavoriteIcon(Z)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_4
    instance-of v2, p1, La/ugb;

    .line 205
    .line 206
    if-eqz v2, :cond_5

    .line 207
    .line 208
    invoke-static {v0}, La/ahb;->w(La/cp;)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_5
    instance-of v2, p1, La/tgb;

    .line 213
    .line 214
    if-eqz v2, :cond_7

    .line 215
    .line 216
    move-object p1, v1

    .line 217
    check-cast p1, La/z3b0;

    .line 218
    .line 219
    iget-object p1, p1, La/z3b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 220
    .line 221
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    check-cast v2, La/zgb;

    .line 226
    .line 227
    iget-boolean v2, v2, La/zgb;->k:Z

    .line 228
    .line 229
    if-nez v2, :cond_6

    .line 230
    .line 231
    move v2, v5

    .line 232
    goto :goto_2

    .line 233
    :cond_6
    move v2, v4

    .line 234
    :goto_2
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_7
    instance-of p1, p1, La/wgb;

    .line 239
    .line 240
    if-eqz p1, :cond_8

    .line 241
    .line 242
    move-object p1, v1

    .line 243
    check-cast p1, La/z3b0;

    .line 244
    .line 245
    iget-object p1, p1, La/z3b0;->d:Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;

    .line 246
    .line 247
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    check-cast v2, La/zgb;

    .line 252
    .line 253
    iget v2, v2, La/zgb;->i:I

    .line 254
    .line 255
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_cell/right/SportCellRightView;->setCounterNumber(Ljava/lang/Integer;)V

    .line 260
    .line 261
    .line 262
    goto :goto_1

    .line 263
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 264
    .line 265
    .line 266
    const/4 p0, 0x0

    .line 267
    return-object p0

    .line 268
    :cond_9
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    return-object p0
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    move-object p1, v2

    .line 21
    check-cast p1, La/xcu0;

    .line 22
    .line 23
    iget-object p1, p1, La/xcu0;->b:Lorg/xplatform/uikit/components/chips/DsChip;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/ifo0;

    .line 30
    .line 31
    iget-object v0, v0, La/ifo0;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    check-cast v2, La/xcu0;

    .line 37
    .line 38
    iget-object p1, v2, La/xcu0;->b:Lorg/xplatform/uikit/components/chips/DsChip;

    .line 39
    .line 40
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/ifo0;

    .line 45
    .line 46
    iget-boolean p0, p0, La/ifo0;->b:Z

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelected(Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast v2, Ljava/util/Collection;

    .line 75
    .line 76
    check-cast v2, Ljava/lang/Iterable;

    .line 77
    .line 78
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, La/hfo0;

    .line 97
    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    instance-of v2, p1, La/gfo0;

    .line 101
    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    move-object p1, v1

    .line 105
    check-cast p1, La/xcu0;

    .line 106
    .line 107
    iget-object p1, p1, La/xcu0;->b:Lorg/xplatform/uikit/components/chips/DsChip;

    .line 108
    .line 109
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, La/ifo0;

    .line 114
    .line 115
    iget-object v2, v2, La/ifo0;->a:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_2
    instance-of p1, p1, La/ffo0;

    .line 122
    .line 123
    if-eqz p1, :cond_3

    .line 124
    .line 125
    move-object p1, v1

    .line 126
    check-cast p1, La/xcu0;

    .line 127
    .line 128
    iget-object p1, p1, La/xcu0;->b:Lorg/xplatform/uikit/components/chips/DsChip;

    .line 129
    .line 130
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, La/ifo0;

    .line 135
    .line 136
    iget-boolean v2, v2, La/ifo0;->b:Z

    .line 137
    .line 138
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelected(Z)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 143
    .line 144
    .line 145
    const/4 p0, 0x0

    .line 146
    return-object p0

    .line 147
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0
.end method

.method private final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0xb

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 16
    .line 17
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/ond;

    .line 22
    .line 23
    iget-object v0, p1, La/ond;->i:La/ank0;

    .line 24
    .line 25
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v0, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v4, p0, La/cp;->u:La/yfu0;

    .line 32
    .line 33
    check-cast v4, La/ntx;

    .line 34
    .line 35
    iget-object v5, v4, La/ntx;->j:Landroid/widget/TextView;

    .line 36
    .line 37
    iget-object v6, v4, La/ntx;->c:Landroidx/constraintlayout/widget/Group;

    .line 38
    .line 39
    iget-object v7, v4, La/ntx;->b:Landroidx/constraintlayout/widget/Group;

    .line 40
    .line 41
    iget-object v8, v4, La/ntx;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 42
    .line 43
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, v4, La/ntx;->j:Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/16 v9, 0x8

    .line 53
    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    move v0, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v0, v9

    .line 59
    :goto_0
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    iget-boolean v0, p1, La/ond;->j:Z

    .line 63
    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-static {v8}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-static {v8}, La/jwb;->y(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    iget-object v0, p1, La/ond;->b:La/ank0;

    .line 74
    .line 75
    invoke-virtual {v0, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, v4, La/ntx;->k:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/CustomCutTextView;

    .line 83
    .line 84
    iget-object v5, p1, La/ond;->g:La/zmk0;

    .line 85
    .line 86
    invoke-virtual {v5, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v0, v5}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/CustomCutTextView;->setSpannableText(Landroid/text/Spannable;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, v4, La/ntx;->m:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/CustomCutTextView;

    .line 94
    .line 95
    iget-object v5, p1, La/ond;->h:La/zmk0;

    .line 96
    .line 97
    invoke-virtual {v5, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v0, v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/CustomCutTextView;->setSpannableText(Landroid/text/Spannable;)V

    .line 102
    .line 103
    .line 104
    iget-boolean p1, p1, La/ond;->l:Z

    .line 105
    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, La/ond;

    .line 113
    .line 114
    invoke-virtual {v7, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v6, v9}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 121
    .line 122
    iget-object v0, v4, La/ntx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 123
    .line 124
    iget-object v3, p1, La/ond;->c:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v0, v3, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v4, La/ntx;->f:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 130
    .line 131
    iget-object v3, p1, La/ond;->e:Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v0, v3, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    iget-object v0, v4, La/ntx;->h:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 137
    .line 138
    iget-object v3, p1, La/ond;->d:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v0, v3, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 141
    .line 142
    .line 143
    iget-object v0, v4, La/ntx;->i:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 144
    .line 145
    iget-object p1, p1, La/ond;->f:Ljava/lang/String;

    .line 146
    .line 147
    invoke-static {v0, p1, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, La/ond;

    .line 156
    .line 157
    iget-object v0, v4, La/ntx;->g:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 158
    .line 159
    iget-object v3, v4, La/ntx;->d:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 160
    .line 161
    invoke-virtual {v7, v9}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    iget-boolean v5, p1, La/ond;->m:Z

    .line 168
    .line 169
    if-eqz v5, :cond_3

    .line 170
    .line 171
    const p1, 0x7f080843

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 175
    .line 176
    .line 177
    const p1, 0x7f080842

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_3
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 185
    .line 186
    iget-object v5, p1, La/ond;->c:Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v3, v5, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 189
    .line 190
    .line 191
    iget-object p1, p1, La/ond;->d:Ljava/lang/String;

    .line 192
    .line 193
    invoke-static {v0, p1, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 194
    .line 195
    .line 196
    :goto_2
    iget-object p1, v4, La/ntx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 197
    .line 198
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    check-cast p0, La/ond;

    .line 203
    .line 204
    iget-boolean p0, p0, La/ond;->o:Z

    .line 205
    .line 206
    if-eqz p0, :cond_4

    .line 207
    .line 208
    const/4 v2, 0x2

    .line 209
    :cond_4
    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_6

    .line 213
    .line 214
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 215
    .line 216
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_6

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    check-cast v3, Ljava/util/Collection;

    .line 237
    .line 238
    check-cast v3, Ljava/lang/Iterable;

    .line 239
    .line 240
    invoke-static {v0, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_11

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Ljava/util/List;

    .line 259
    .line 260
    new-instance v3, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    if-eqz v4, :cond_9

    .line 274
    .line 275
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    instance-of v5, v4, La/lmd;

    .line 280
    .line 281
    if-eqz v5, :cond_8

    .line 282
    .line 283
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_9
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_7

    .line 296
    .line 297
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    check-cast v3, La/lmd;

    .line 302
    .line 303
    iget-object v4, p0, La/ok;->c:La/cp;

    .line 304
    .line 305
    iget-object v5, v4, La/cp;->w:Landroid/content/Context;

    .line 306
    .line 307
    iget-object v4, v4, La/cp;->u:La/yfu0;

    .line 308
    .line 309
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    instance-of v6, v3, La/fmd;

    .line 313
    .line 314
    if-eqz v6, :cond_a

    .line 315
    .line 316
    check-cast v4, La/ntx;

    .line 317
    .line 318
    iget-object v4, v4, La/ntx;->j:Landroid/widget/TextView;

    .line 319
    .line 320
    check-cast v3, La/fmd;

    .line 321
    .line 322
    iget-object v3, v3, La/fmd;->a:La/ank0;

    .line 323
    .line 324
    invoke-virtual {v3, v5}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_a
    instance-of v6, v3, La/gmd;

    .line 333
    .line 334
    if-eqz v6, :cond_c

    .line 335
    .line 336
    check-cast v4, La/ntx;

    .line 337
    .line 338
    iget-object v6, v4, La/ntx;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 339
    .line 340
    invoke-virtual {v6}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 341
    .line 342
    .line 343
    move-result-object v6

    .line 344
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    check-cast v3, La/gmd;

    .line 349
    .line 350
    iget-object v3, v3, La/gmd;->a:La/ank0;

    .line 351
    .line 352
    invoke-virtual {v3}, La/ank0;->a()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    new-instance v8, Lkotlin/text/Regex;

    .line 357
    .line 358
    const-string v9, "\\d+"

    .line 359
    .line 360
    invoke-direct {v8, v9}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v8, v6}, Lkotlin/text/Regex;->d(Lkotlin/text/Regex;Ljava/lang/CharSequence;)La/tjt;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    new-instance v9, La/y2d;

    .line 368
    .line 369
    const/16 v10, 0x11

    .line 370
    .line 371
    invoke-direct {v9, v10}, La/y2d;-><init>(B)V

    .line 372
    .line 373
    .line 374
    invoke-static {v6, v9}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    invoke-static {v6}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->C0(Ljava/util/List;)I

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    invoke-static {v8, v7}, Lkotlin/text/Regex;->d(Lkotlin/text/Regex;Ljava/lang/CharSequence;)La/tjt;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    new-instance v8, La/y2d;

    .line 391
    .line 392
    const/16 v9, 0x12

    .line 393
    .line 394
    invoke-direct {v8, v9}, La/y2d;-><init>(B)V

    .line 395
    .line 396
    .line 397
    invoke-static {v7, v8}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-static {v7}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->C0(Ljava/util/List;)I

    .line 406
    .line 407
    .line 408
    move-result v7

    .line 409
    iget-object v4, v4, La/ntx;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 410
    .line 411
    if-ge v6, v7, :cond_b

    .line 412
    .line 413
    invoke-virtual {v3, v5}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 418
    .line 419
    .line 420
    goto/16 :goto_5

    .line 421
    .line 422
    :cond_b
    invoke-virtual {v3}, La/ank0;->a()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    const-string v5, ", "

    .line 427
    .line 428
    const-string v6, ""

    .line 429
    .line 430
    invoke-static {v3, v5, v6, v2}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_5

    .line 438
    .line 439
    :cond_c
    instance-of v5, v3, La/hmd;

    .line 440
    .line 441
    if-eqz v5, :cond_d

    .line 442
    .line 443
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 444
    .line 445
    check-cast v4, La/ntx;

    .line 446
    .line 447
    iget-object v4, v4, La/ntx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 448
    .line 449
    check-cast v3, La/hmd;

    .line 450
    .line 451
    iget-object v3, v3, La/hmd;->a:Ljava/lang/String;

    .line 452
    .line 453
    invoke-static {v4, v3, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_5

    .line 457
    .line 458
    :cond_d
    instance-of v5, v3, La/imd;

    .line 459
    .line 460
    if-eqz v5, :cond_e

    .line 461
    .line 462
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 463
    .line 464
    check-cast v4, La/ntx;

    .line 465
    .line 466
    iget-object v4, v4, La/ntx;->f:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 467
    .line 468
    check-cast v3, La/imd;

    .line 469
    .line 470
    iget-object v3, v3, La/imd;->a:Ljava/lang/String;

    .line 471
    .line 472
    invoke-static {v4, v3, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_5

    .line 476
    .line 477
    :cond_e
    instance-of v5, v3, La/jmd;

    .line 478
    .line 479
    if-eqz v5, :cond_f

    .line 480
    .line 481
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 482
    .line 483
    check-cast v4, La/ntx;

    .line 484
    .line 485
    iget-object v4, v4, La/ntx;->h:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 486
    .line 487
    check-cast v3, La/jmd;

    .line 488
    .line 489
    iget-object v3, v3, La/jmd;->a:Ljava/lang/String;

    .line 490
    .line 491
    invoke-static {v4, v3, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_5

    .line 495
    .line 496
    :cond_f
    instance-of v5, v3, La/kmd;

    .line 497
    .line 498
    if-eqz v5, :cond_10

    .line 499
    .line 500
    sget-object v5, La/u0d;->a:Ljava/util/List;

    .line 501
    .line 502
    check-cast v4, La/ntx;

    .line 503
    .line 504
    iget-object v4, v4, La/ntx;->i:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 505
    .line 506
    check-cast v3, La/kmd;

    .line 507
    .line 508
    iget-object v3, v3, La/kmd;->a:Ljava/lang/String;

    .line 509
    .line 510
    invoke-static {v4, v3, v2, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_5

    .line 514
    .line 515
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 516
    .line 517
    .line 518
    const/4 p0, 0x0

    .line 519
    return-object p0

    .line 520
    :cond_11
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 521
    .line 522
    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 13
    .line 14
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/apd;

    .line 19
    .line 20
    iget-object v0, p1, La/apd;->e:La/ank0;

    .line 21
    .line 22
    iget-object v1, p0, La/cp;->w:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 29
    .line 30
    check-cast v2, La/ptx;

    .line 31
    .line 32
    iget-object v3, v2, La/ptx;->b:Landroid/widget/TextView;

    .line 33
    .line 34
    iget-object v4, v2, La/ptx;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 35
    .line 36
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v2, La/ptx;->b:Landroid/widget/TextView;

    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const/4 v5, 0x0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    move v0, v5

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/16 v0, 0x8

    .line 51
    .line 52
    :goto_0
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-boolean v0, p1, La/apd;->f:Z

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-static {v4}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-static {v4}, La/jwb;->y(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    iget-object v0, p1, La/apd;->b:La/ank0;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v2, La/ptx;->c:Landroid/widget/TextView;

    .line 76
    .line 77
    iget-object v3, p1, La/apd;->c:La/zmk0;

    .line 78
    .line 79
    invoke-virtual {v3, v1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v2, La/ptx;->e:Landroid/widget/TextView;

    .line 87
    .line 88
    iget-object p1, p1, La/apd;->d:La/zmk0;

    .line 89
    .line 90
    invoke-virtual {p1, v1}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, v2, La/ptx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 98
    .line 99
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/apd;

    .line 104
    .line 105
    iget-boolean p0, p0, La/apd;->i:Z

    .line 106
    .line 107
    if-eqz p0, :cond_2

    .line 108
    .line 109
    const/4 v5, 0x2

    .line 110
    :cond_2
    invoke-virtual {p1, v5}, Landroid/view/View;->setLayoutDirection(I)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_5

    .line 114
    .line 115
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    check-cast v1, Ljava/util/Collection;

    .line 138
    .line 139
    check-cast v1, Ljava/lang/Iterable;

    .line 140
    .line 141
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_a

    .line 154
    .line 155
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, Ljava/util/List;

    .line 160
    .line 161
    new-instance v1, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_7

    .line 175
    .line 176
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    instance-of v3, v2, La/xmd;

    .line 181
    .line 182
    if-eqz v3, :cond_6

    .line 183
    .line 184
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eqz v1, :cond_5

    .line 197
    .line 198
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v1, La/xmd;

    .line 203
    .line 204
    iget-object v2, p0, La/ok;->c:La/cp;

    .line 205
    .line 206
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 207
    .line 208
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    instance-of v4, v1, La/vmd;

    .line 214
    .line 215
    if-eqz v4, :cond_8

    .line 216
    .line 217
    check-cast v2, La/ptx;

    .line 218
    .line 219
    iget-object v2, v2, La/ptx;->b:Landroid/widget/TextView;

    .line 220
    .line 221
    check-cast v1, La/vmd;

    .line 222
    .line 223
    iget-object v1, v1, La/vmd;->a:La/ank0;

    .line 224
    .line 225
    invoke-virtual {v1, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_8
    instance-of v4, v1, La/wmd;

    .line 234
    .line 235
    if-eqz v4, :cond_9

    .line 236
    .line 237
    check-cast v2, La/ptx;

    .line 238
    .line 239
    iget-object v2, v2, La/ptx;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 240
    .line 241
    check-cast v1, La/wmd;

    .line 242
    .line 243
    iget-object v1, v1, La/wmd;->a:La/ank0;

    .line 244
    .line 245
    invoke-virtual {v1, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 254
    .line 255
    .line 256
    const/4 p0, 0x0

    .line 257
    return-object p0

    .line 258
    :cond_a
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object p0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 13
    .line 14
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/mpd;

    .line 19
    .line 20
    iget-object v0, p1, La/mpd;->c:La/ank0;

    .line 21
    .line 22
    iget-object v1, p0, La/cp;->w:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 29
    .line 30
    check-cast p0, La/stx;

    .line 31
    .line 32
    iget-object v2, p0, La/stx;->b:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, La/stx;->b:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/16 v0, 0x8

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/stx;->c:Landroid/widget/TextView;

    .line 53
    .line 54
    iget-object p1, p1, La/mpd;->b:La/ank0;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast v1, Ljava/util/Collection;

    .line 88
    .line 89
    check-cast v1, Ljava/lang/Iterable;

    .line 90
    .line 91
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Ljava/util/List;

    .line 110
    .line 111
    new-instance v1, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_5

    .line 125
    .line 126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    instance-of v3, v2, La/jnd;

    .line 131
    .line 132
    if-eqz v3, :cond_4

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_3

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, La/jnd;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    instance-of v2, v1, La/jnd;

    .line 158
    .line 159
    if-eqz v2, :cond_6

    .line 160
    .line 161
    iget-object v2, p0, La/ok;->c:La/cp;

    .line 162
    .line 163
    iget-object v3, v2, La/cp;->u:La/yfu0;

    .line 164
    .line 165
    check-cast v3, La/stx;

    .line 166
    .line 167
    iget-object v3, v3, La/stx;->b:Landroid/widget/TextView;

    .line 168
    .line 169
    iget-object v1, v1, La/jnd;->a:La/ank0;

    .line 170
    .line 171
    iget-object v2, v2, La/cp;->w:Landroid/content/Context;

    .line 172
    .line 173
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 182
    .line 183
    .line 184
    const/4 p0, 0x0

    .line 185
    return-object p0

    .line 186
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 13
    .line 14
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 19
    .line 20
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 21
    .line 22
    check-cast p1, La/ee90;

    .line 23
    .line 24
    check-cast p0, La/rtx;

    .line 25
    .line 26
    iget-object v1, p0, La/rtx;->b:Landroid/widget/ImageView;

    .line 27
    .line 28
    iget v2, p1, La/ee90;->a:I

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, La/rtx;->c:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v2, p1, La/ee90;->b:La/zmk0;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/rtx;->d:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object p1, p1, La/ee90;->c:La/zmk0;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast v1, Ljava/util/Collection;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Iterable;

    .line 82
    .line 83
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/util/List;

    .line 102
    .line 103
    new-instance v1, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    instance-of v3, v2, La/rpd;

    .line 123
    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, La/rpd;

    .line 145
    .line 146
    iget-object v2, p0, La/ok;->c:La/cp;

    .line 147
    .line 148
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 149
    .line 150
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    instance-of v4, v1, La/ppd;

    .line 156
    .line 157
    if-eqz v4, :cond_5

    .line 158
    .line 159
    check-cast v2, La/rtx;

    .line 160
    .line 161
    iget-object v2, v2, La/rtx;->c:Landroid/widget/TextView;

    .line 162
    .line 163
    check-cast v1, La/ppd;

    .line 164
    .line 165
    iget-object v1, v1, La/ppd;->a:La/zmk0;

    .line 166
    .line 167
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    instance-of v4, v1, La/qpd;

    .line 176
    .line 177
    if-eqz v4, :cond_6

    .line 178
    .line 179
    check-cast v2, La/rtx;

    .line 180
    .line 181
    iget-object v2, v2, La/rtx;->d:Landroid/widget/TextView;

    .line 182
    .line 183
    check-cast v1, La/qpd;

    .line 184
    .line 185
    iget-object v1, v1, La/qpd;->a:La/zmk0;

    .line 186
    .line 187
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 196
    .line 197
    .line 198
    const/4 p0, 0x0

    .line 199
    return-object p0

    .line 200
    :cond_7
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 13
    .line 14
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 19
    .line 20
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 21
    .line 22
    check-cast p1, La/cf90;

    .line 23
    .line 24
    check-cast p0, La/qtx;

    .line 25
    .line 26
    iget-object v1, p0, La/qtx;->b:Landroid/widget/TextView;

    .line 27
    .line 28
    iget-object v2, p1, La/cf90;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, La/qtx;->c:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v2, p1, La/cf90;->b:La/zmk0;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/qtx;->d:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object p1, p1, La/cf90;->c:La/zmk0;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_3

    .line 56
    .line 57
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast v1, Ljava/util/Collection;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Iterable;

    .line 82
    .line 83
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/util/List;

    .line 102
    .line 103
    new-instance v1, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    instance-of v3, v2, La/vpd;

    .line 123
    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-eqz v1, :cond_2

    .line 139
    .line 140
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, La/vpd;

    .line 145
    .line 146
    iget-object v2, p0, La/ok;->c:La/cp;

    .line 147
    .line 148
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 149
    .line 150
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    instance-of v4, v1, La/tpd;

    .line 156
    .line 157
    if-eqz v4, :cond_5

    .line 158
    .line 159
    check-cast v2, La/qtx;

    .line 160
    .line 161
    iget-object v2, v2, La/qtx;->c:Landroid/widget/TextView;

    .line 162
    .line 163
    check-cast v1, La/tpd;

    .line 164
    .line 165
    iget-object v1, v1, La/tpd;->a:La/zmk0;

    .line 166
    .line 167
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    instance-of v4, v1, La/upd;

    .line 176
    .line 177
    if-eqz v4, :cond_6

    .line 178
    .line 179
    check-cast v2, La/qtx;

    .line 180
    .line 181
    iget-object v2, v2, La/qtx;->d:Landroid/widget/TextView;

    .line 182
    .line 183
    check-cast v1, La/upd;

    .line 184
    .line 185
    iget-object v1, v1, La/upd;->a:La/zmk0;

    .line 186
    .line 187
    invoke-virtual {v1, v3}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_6
    instance-of v3, v1, La/spd;

    .line 196
    .line 197
    if-eqz v3, :cond_7

    .line 198
    .line 199
    check-cast v2, La/qtx;

    .line 200
    .line 201
    iget-object v2, v2, La/qtx;->b:Landroid/widget/TextView;

    .line 202
    .line 203
    check-cast v1, La/spd;

    .line 204
    .line 205
    iget-object v1, v1, La/spd;->a:Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 212
    .line 213
    .line 214
    const/4 p0, 0x0

    .line 215
    return-object p0

    .line 216
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 13
    .line 14
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 15
    .line 16
    check-cast p1, La/otx;

    .line 17
    .line 18
    iget-object v0, p1, La/otx;->i:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, La/aqd;

    .line 25
    .line 26
    iget-object v1, v1, La/aqd;->b:La/ank0;

    .line 27
    .line 28
    iget-object v2, p0, La/cp;->w:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 38
    .line 39
    iget-object v0, p1, La/otx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 40
    .line 41
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, La/aqd;

    .line 46
    .line 47
    iget-object v1, v1, La/aqd;->e:Ljava/lang/String;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/16 v4, 0xb

    .line 51
    .line 52
    invoke-static {v0, v1, v3, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p1, La/otx;->d:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 56
    .line 57
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, La/aqd;

    .line 62
    .line 63
    iget-object v1, v1, La/aqd;->f:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1, v3, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p1, La/otx;->g:Landroid/widget/TextView;

    .line 69
    .line 70
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/aqd;

    .line 75
    .line 76
    iget-object v1, v1, La/aqd;->c:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p1, La/otx;->j:Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, La/aqd;

    .line 88
    .line 89
    iget-object v1, v1, La/aqd;->d:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p1, La/otx;->h:Landroidx/appcompat/widget/AppCompatTextView;

    .line 95
    .line 96
    invoke-static {v0}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/aqd;

    .line 104
    .line 105
    iget-object v1, v1, La/aqd;->g:La/ank0;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p1, La/otx;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 115
    .line 116
    invoke-static {p1}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, La/aqd;

    .line 124
    .line 125
    iget-object p0, p0, La/aqd;->h:La/ank0;

    .line 126
    .line 127
    invoke-virtual {p0, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_1

    .line 150
    .line 151
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    check-cast v1, Ljava/util/Collection;

    .line 159
    .line 160
    check-cast v1, Ljava/lang/Iterable;

    .line 161
    .line 162
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Ljava/util/List;

    .line 181
    .line 182
    new-instance v1, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_4

    .line 196
    .line 197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    instance-of v3, v2, La/umd;

    .line 202
    .line 203
    if-eqz v3, :cond_3

    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_2

    .line 218
    .line 219
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    check-cast v1, La/umd;

    .line 224
    .line 225
    iget-object v2, p0, La/ok;->c:La/cp;

    .line 226
    .line 227
    iget-object v3, v2, La/cp;->w:Landroid/content/Context;

    .line 228
    .line 229
    iget-object v2, v2, La/cp;->u:La/yfu0;

    .line 230
    .line 231
    if-eqz v1, :cond_7

    .line 232
    .line 233
    instance-of v4, v1, La/rmd;

    .line 234
    .line 235
    if-eqz v4, :cond_5

    .line 236
    .line 237
    check-cast v2, La/otx;

    .line 238
    .line 239
    iget-object v2, v2, La/otx;->h:Landroidx/appcompat/widget/AppCompatTextView;

    .line 240
    .line 241
    check-cast v1, La/rmd;

    .line 242
    .line 243
    iget-object v1, v1, La/rmd;->a:La/ank0;

    .line 244
    .line 245
    invoke-virtual {v1, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 250
    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_5
    instance-of v4, v1, La/tmd;

    .line 254
    .line 255
    if-eqz v4, :cond_6

    .line 256
    .line 257
    check-cast v2, La/otx;

    .line 258
    .line 259
    iget-object v2, v2, La/otx;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 260
    .line 261
    check-cast v1, La/tmd;

    .line 262
    .line 263
    iget-object v1, v1, La/tmd;->a:La/ank0;

    .line 264
    .line 265
    invoke-virtual {v1, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_6
    instance-of v4, v1, La/smd;

    .line 274
    .line 275
    if-eqz v4, :cond_7

    .line 276
    .line 277
    check-cast v2, La/otx;

    .line 278
    .line 279
    iget-object v2, v2, La/otx;->i:Landroid/widget/TextView;

    .line 280
    .line 281
    check-cast v1, La/smd;

    .line 282
    .line 283
    iget-object v1, v1, La/smd;->a:La/ank0;

    .line 284
    .line 285
    invoke-virtual {v1, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    .line 291
    .line 292
    goto :goto_2

    .line 293
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 294
    .line 295
    .line 296
    const/4 p0, 0x0

    .line 297
    return-object p0

    .line 298
    :cond_8
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0
.end method

.method private final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 13
    .line 14
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, La/gqd;

    .line 19
    .line 20
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 21
    .line 22
    check-cast v0, La/qtx;

    .line 23
    .line 24
    iget-object v1, v0, La/qtx;->b:Landroid/widget/TextView;

    .line 25
    .line 26
    iget-object v2, p1, La/gqd;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, La/qtx;->c:Landroid/widget/TextView;

    .line 32
    .line 33
    iget-object v2, p1, La/gqd;->b:La/zmk0;

    .line 34
    .line 35
    iget-object p0, p0, La/cp;->w:Landroid/content/Context;

    .line 36
    .line 37
    invoke-virtual {v2, p0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, La/qtx;->d:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object p1, p1, La/gqd;->c:La/zmk0;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_2

    .line 56
    .line 57
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast v1, Ljava/util/Collection;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Iterable;

    .line 82
    .line 83
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, La/fqd;

    .line 102
    .line 103
    iget-object v1, p0, La/ok;->c:La/cp;

    .line 104
    .line 105
    iget-object v2, v1, La/cp;->w:Landroid/content/Context;

    .line 106
    .line 107
    iget-object v1, v1, La/cp;->u:La/yfu0;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    instance-of v3, v0, La/dqd;

    .line 113
    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    check-cast v1, La/qtx;

    .line 117
    .line 118
    iget-object v1, v1, La/qtx;->c:Landroid/widget/TextView;

    .line 119
    .line 120
    check-cast v0, La/dqd;

    .line 121
    .line 122
    iget-object v0, v0, La/dqd;->a:La/zmk0;

    .line 123
    .line 124
    invoke-virtual {v0, v2}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    instance-of v3, v0, La/eqd;

    .line 133
    .line 134
    if-eqz v3, :cond_3

    .line 135
    .line 136
    check-cast v1, La/qtx;

    .line 137
    .line 138
    iget-object v1, v1, La/qtx;->d:Landroid/widget/TextView;

    .line 139
    .line 140
    check-cast v0, La/eqd;

    .line 141
    .line 142
    iget-object v0, v0, La/eqd;->a:La/zmk0;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, La/zmk0;->a(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    instance-of v2, v0, La/cqd;

    .line 153
    .line 154
    if-eqz v2, :cond_4

    .line 155
    .line 156
    check-cast v1, La/qtx;

    .line 157
    .line 158
    iget-object v1, v1, La/qtx;->b:Landroid/widget/TextView;

    .line 159
    .line 160
    check-cast v0, La/cqd;

    .line 161
    .line 162
    iget-object v0, v0, La/cqd;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 169
    .line 170
    .line 171
    const/4 p0, 0x0

    .line 172
    return-object p0

    .line 173
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    move-object p1, v2

    .line 22
    check-cast p1, La/scu0;

    .line 23
    .line 24
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 25
    .line 26
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/jse;

    .line 31
    .line 32
    iget-object v0, v0, La/jse;->r:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    move-object p1, v2

    .line 38
    check-cast p1, La/scu0;

    .line 39
    .line 40
    iget-object v0, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setAutoSub(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setOptionBet(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setEachWay(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->getCurrentStyledView()La/pse;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    instance-of v1, v1, La/mue;

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, La/jse;

    .line 66
    .line 67
    iget v1, v1, La/jse;->i:I

    .line 68
    .line 69
    if-nez v1, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, La/jse;

    .line 77
    .line 78
    iget v1, v1, La/jse;->i:I

    .line 79
    .line 80
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    :goto_0
    if-eqz v4, :cond_1

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setSportImage(I)V

    .line 91
    .line 92
    .line 93
    :cond_1
    move-object v0, v2

    .line 94
    check-cast v0, La/scu0;

    .line 95
    .line 96
    iget-object v0, v0, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 97
    .line 98
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, La/jse;

    .line 103
    .line 104
    iget v1, v1, La/jse;->k:I

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setCouponBonusTitleStyle(I)V

    .line 107
    .line 108
    .line 109
    move-object v0, v2

    .line 110
    check-cast v0, La/scu0;

    .line 111
    .line 112
    iget-object v0, v0, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 113
    .line 114
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, La/jse;

    .line 119
    .line 120
    iget-object v1, v1, La/jse;->j:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setCouponBonusTitle(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    move-object v0, v2

    .line 126
    check-cast v0, La/scu0;

    .line 127
    .line 128
    iget-object v0, v0, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 129
    .line 130
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, La/jse;

    .line 135
    .line 136
    iget-object v1, v1, La/jse;->l:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setTagText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    move-object v0, v2

    .line 142
    check-cast v0, La/scu0;

    .line 143
    .line 144
    iget-object v0, v0, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 145
    .line 146
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, La/jse;

    .line 151
    .line 152
    iget v1, v1, La/jse;->p:I

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMarketStyle(I)V

    .line 155
    .line 156
    .line 157
    move-object v0, v2

    .line 158
    check-cast v0, La/scu0;

    .line 159
    .line 160
    iget-object v0, v0, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 161
    .line 162
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, La/jse;

    .line 167
    .line 168
    iget v1, v1, La/jse;->n:I

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMarketDescriptionStyle(I)V

    .line 171
    .line 172
    .line 173
    move-object v0, v2

    .line 174
    check-cast v0, La/scu0;

    .line 175
    .line 176
    iget-object v0, v0, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 177
    .line 178
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, La/jse;

    .line 183
    .line 184
    iget-object v1, v1, La/jse;->m:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 190
    .line 191
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, La/jse;

    .line 196
    .line 197
    iget-object v0, v0, La/jse;->o:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMarketHeader(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    check-cast v2, La/scu0;

    .line 203
    .line 204
    iget-object p1, v2, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 205
    .line 206
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    check-cast p0, La/jse;

    .line 211
    .line 212
    iget-object p0, p0, La/jse;->q:Ljava/lang/String;

    .line 213
    .line 214
    sget-object v0, La/j0d;->a:La/j0d;

    .line 215
    .line 216
    iget-object p1, p1, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 217
    .line 218
    if-eqz p1, :cond_c

    .line 219
    .line 220
    invoke-interface {p1, p0, v0}, La/pse;->b(Ljava/lang/CharSequence;La/j0d;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_3

    .line 224
    .line 225
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-eqz v2, :cond_3

    .line 239
    .line 240
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    check-cast v2, Ljava/util/Collection;

    .line 248
    .line 249
    check-cast v2, Ljava/lang/Iterable;

    .line 250
    .line 251
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-eqz p1, :cond_c

    .line 264
    .line 265
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    check-cast p1, La/ise;

    .line 270
    .line 271
    if-eqz p1, :cond_b

    .line 272
    .line 273
    instance-of v2, p1, La/hse;

    .line 274
    .line 275
    if-eqz v2, :cond_5

    .line 276
    .line 277
    move-object p1, v1

    .line 278
    check-cast p1, La/scu0;

    .line 279
    .line 280
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 281
    .line 282
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, La/jse;

    .line 287
    .line 288
    iget v2, v2, La/jse;->k:I

    .line 289
    .line 290
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setCouponBonusTitleStyle(I)V

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_5
    instance-of v2, p1, La/gse;

    .line 295
    .line 296
    if-eqz v2, :cond_6

    .line 297
    .line 298
    move-object p1, v1

    .line 299
    check-cast p1, La/scu0;

    .line 300
    .line 301
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 302
    .line 303
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v2, La/jse;

    .line 308
    .line 309
    iget-object v2, v2, La/jse;->j:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setCouponBonusTitle(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_6
    instance-of v2, p1, La/fse;

    .line 316
    .line 317
    if-eqz v2, :cond_7

    .line 318
    .line 319
    move-object p1, v1

    .line 320
    check-cast p1, La/scu0;

    .line 321
    .line 322
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 323
    .line 324
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    check-cast v2, La/jse;

    .line 329
    .line 330
    iget-object v2, v2, La/jse;->l:Ljava/lang/String;

    .line 331
    .line 332
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setTagText(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    goto :goto_2

    .line 336
    :cond_7
    instance-of v2, p1, La/ese;

    .line 337
    .line 338
    if-eqz v2, :cond_8

    .line 339
    .line 340
    move-object p1, v1

    .line 341
    check-cast p1, La/scu0;

    .line 342
    .line 343
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 344
    .line 345
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    check-cast v2, La/jse;

    .line 350
    .line 351
    iget v2, v2, La/jse;->p:I

    .line 352
    .line 353
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMarketStyle(I)V

    .line 354
    .line 355
    .line 356
    goto :goto_2

    .line 357
    :cond_8
    instance-of v2, p1, La/dse;

    .line 358
    .line 359
    if-eqz v2, :cond_9

    .line 360
    .line 361
    move-object p1, v1

    .line 362
    check-cast p1, La/scu0;

    .line 363
    .line 364
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 365
    .line 366
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    check-cast v2, La/jse;

    .line 371
    .line 372
    iget v2, v2, La/jse;->n:I

    .line 373
    .line 374
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMarketDescriptionStyle(I)V

    .line 375
    .line 376
    .line 377
    goto :goto_2

    .line 378
    :cond_9
    instance-of v2, p1, La/cse;

    .line 379
    .line 380
    if-eqz v2, :cond_a

    .line 381
    .line 382
    move-object p1, v1

    .line 383
    check-cast p1, La/scu0;

    .line 384
    .line 385
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 386
    .line 387
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    check-cast v2, La/jse;

    .line 392
    .line 393
    iget-object v2, v2, La/jse;->m:Ljava/lang/String;

    .line 394
    .line 395
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMarketDescription(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_2

    .line 399
    .line 400
    :cond_a
    instance-of p1, p1, La/bse;

    .line 401
    .line 402
    if-eqz p1, :cond_b

    .line 403
    .line 404
    move-object p1, v1

    .line 405
    check-cast p1, La/scu0;

    .line 406
    .line 407
    iget-object p1, p1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 408
    .line 409
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    check-cast v2, La/jse;

    .line 414
    .line 415
    iget-object v2, v2, La/jse;->q:Ljava/lang/String;

    .line 416
    .line 417
    sget-object v3, La/j0d;->a:La/j0d;

    .line 418
    .line 419
    iget-object p1, p1, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->j:La/pse;

    .line 420
    .line 421
    if-eqz p1, :cond_4

    .line 422
    .line 423
    invoke-interface {p1, v2, v3}, La/pse;->b(Ljava/lang/CharSequence;La/j0d;)V

    .line 424
    .line 425
    .line 426
    goto/16 :goto_2

    .line 427
    .line 428
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 429
    .line 430
    .line 431
    return-object v4

    .line 432
    :cond_c
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    return-object p0
.end method

.method private final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->b:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    check-cast p0, La/k7g;

    .line 20
    .line 21
    iget-object v2, p0, La/k7g;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 22
    .line 23
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/a7g;

    .line 28
    .line 29
    iget-object v3, p0, La/a7g;->b:Ljava/lang/String;

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/16 v9, 0x1fc

    .line 33
    .line 34
    const v4, 0x7f080737

    .line 35
    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-static/range {v2 .. v9}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 41
    .line 42
    .line 43
    move-object p0, v1

    .line 44
    check-cast p0, La/k7g;

    .line 45
    .line 46
    iget-object p1, p0, La/k7g;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 47
    .line 48
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, La/a7g;

    .line 53
    .line 54
    iget-boolean v2, v2, La/a7g;->e:Z

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/16 v2, 0x8

    .line 61
    .line 62
    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, La/k7g;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 66
    .line 67
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, La/a7g;

    .line 72
    .line 73
    iget-object p1, p1, La/a7g;->c:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    check-cast v1, La/k7g;

    .line 79
    .line 80
    iget-object p0, v1, La/k7g;->b:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 81
    .line 82
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, La/a7g;

    .line 87
    .line 88
    iget-boolean p1, p1, La/a7g;->d:Z

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setChecked(Z)V

    .line 91
    .line 92
    .line 93
    iget-object p0, v1, La/k7g;->b:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-eqz v1, :cond_2

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    check-cast v1, Ljava/util/Collection;

    .line 122
    .line 123
    check-cast v1, Ljava/lang/Iterable;

    .line 124
    .line 125
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_4

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, La/z6g;

    .line 144
    .line 145
    sget-object v1, La/z6g;->a:La/z6g;

    .line 146
    .line 147
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 154
    .line 155
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 156
    .line 157
    check-cast v1, La/k7g;

    .line 158
    .line 159
    iget-object v2, v1, La/k7g;->b:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 160
    .line 161
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, La/a7g;

    .line 166
    .line 167
    iget-boolean v0, v0, La/a7g;->d:Z

    .line 168
    .line 169
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;->setChecked(Z)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v1, La/k7g;->b:Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 179
    .line 180
    .line 181
    const/4 p0, 0x0

    .line 182
    return-object p0

    .line 183
    :cond_4
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0
.end method

.method private final t(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-static {p0}, La/thb;->s(La/cp;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v2

    .line 24
    check-cast p1, La/hth;

    .line 25
    .line 26
    iget-object p1, p1, La/hth;->c:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/tog;

    .line 33
    .line 34
    iget-object v0, v0, La/tog;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v2

    .line 40
    check-cast p1, La/hth;

    .line 41
    .line 42
    iget-object p1, p1, La/hth;->d:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/tog;

    .line 49
    .line 50
    iget-object v0, v0, La/tog;->c:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v2

    .line 56
    check-cast p1, La/hth;

    .line 57
    .line 58
    iget-object p1, p1, La/hth;->f:Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/tog;

    .line 65
    .line 66
    iget-object v0, v0, La/tog;->d:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    check-cast v2, La/hth;

    .line 72
    .line 73
    iget-object p1, v2, La/hth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 74
    .line 75
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/tog;

    .line 80
    .line 81
    iget p0, p0, La/tog;->e:I

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_1

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v2, Ljava/util/Collection;

    .line 111
    .line 112
    check-cast v2, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, La/sog;

    .line 133
    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    instance-of v2, p1, La/oog;

    .line 137
    .line 138
    if-eqz v2, :cond_2

    .line 139
    .line 140
    invoke-static {v0}, La/thb;->s(La/cp;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_2
    instance-of v2, p1, La/rog;

    .line 145
    .line 146
    if-eqz v2, :cond_3

    .line 147
    .line 148
    move-object p1, v1

    .line 149
    check-cast p1, La/hth;

    .line 150
    .line 151
    iget-object p1, p1, La/hth;->c:Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, La/tog;

    .line 158
    .line 159
    iget-object v2, v2, La/tog;->b:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    instance-of v2, p1, La/pog;

    .line 166
    .line 167
    if-eqz v2, :cond_4

    .line 168
    .line 169
    move-object p1, v1

    .line 170
    check-cast p1, La/hth;

    .line 171
    .line 172
    iget-object p1, p1, La/hth;->d:Landroid/widget/TextView;

    .line 173
    .line 174
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, La/tog;

    .line 179
    .line 180
    iget-object v2, v2, La/tog;->c:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_4
    instance-of v2, p1, La/qog;

    .line 187
    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    move-object p1, v1

    .line 191
    check-cast p1, La/hth;

    .line 192
    .line 193
    iget-object p1, p1, La/hth;->f:Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, La/tog;

    .line 200
    .line 201
    iget-object v2, v2, La/tog;->d:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 204
    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_5
    instance-of p1, p1, La/nog;

    .line 208
    .line 209
    if-eqz p1, :cond_6

    .line 210
    .line 211
    move-object p1, v1

    .line 212
    check-cast p1, La/hth;

    .line 213
    .line 214
    iget-object p1, p1, La/hth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 215
    .line 216
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, La/tog;

    .line 221
    .line 222
    iget v2, v2, La/tog;->e:I

    .line 223
    .line 224
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 229
    .line 230
    .line 231
    const/4 p0, 0x0

    .line 232
    return-object p0

    .line 233
    :cond_7
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object p0
.end method

.method private final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-static {p0}, La/ntb;->C(La/cp;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v2

    .line 24
    check-cast p1, La/ith;

    .line 25
    .line 26
    iget-object p1, p1, La/ith;->f:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/kov;

    .line 33
    .line 34
    iget-object v0, v0, La/kov;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, La/ntb;->D(La/cp;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v2

    .line 43
    check-cast p1, La/ith;

    .line 44
    .line 45
    iget-object p1, p1, La/ith;->g:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/kov;

    .line 52
    .line 53
    iget-object v0, v0, La/kov;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    move-object p1, v2

    .line 59
    check-cast p1, La/ith;

    .line 60
    .line 61
    iget-object p1, p1, La/ith;->e:Landroid/widget/TextView;

    .line 62
    .line 63
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, La/kov;

    .line 68
    .line 69
    iget-object v0, v0, La/kov;->e:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    check-cast v2, La/ith;

    .line 75
    .line 76
    iget-object p1, v2, La/ith;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 77
    .line 78
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, La/kov;

    .line 85
    .line 86
    iget p0, p0, La/kov;->f:I

    .line 87
    .line 88
    invoke-static {p0, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_1

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    check-cast v2, Ljava/util/Collection;

    .line 120
    .line 121
    check-cast v2, Ljava/lang/Iterable;

    .line 122
    .line 123
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_8

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, La/jov;

    .line 142
    .line 143
    if-eqz p1, :cond_7

    .line 144
    .line 145
    instance-of v2, p1, La/fov;

    .line 146
    .line 147
    if-eqz v2, :cond_2

    .line 148
    .line 149
    invoke-static {v0}, La/ntb;->C(La/cp;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    instance-of v2, p1, La/gov;

    .line 154
    .line 155
    if-eqz v2, :cond_3

    .line 156
    .line 157
    move-object p1, v1

    .line 158
    check-cast p1, La/ith;

    .line 159
    .line 160
    iget-object p1, p1, La/ith;->f:Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    check-cast v2, La/kov;

    .line 167
    .line 168
    iget-object v2, v2, La/kov;->b:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_3
    instance-of v2, p1, La/hov;

    .line 175
    .line 176
    if-eqz v2, :cond_4

    .line 177
    .line 178
    invoke-static {v0}, La/ntb;->D(La/cp;)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_4
    instance-of v2, p1, La/iov;

    .line 183
    .line 184
    if-eqz v2, :cond_5

    .line 185
    .line 186
    move-object p1, v1

    .line 187
    check-cast p1, La/ith;

    .line 188
    .line 189
    iget-object p1, p1, La/ith;->g:Landroid/widget/TextView;

    .line 190
    .line 191
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    check-cast v2, La/kov;

    .line 196
    .line 197
    iget-object v2, v2, La/kov;->d:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_5
    instance-of v2, p1, La/dov;

    .line 204
    .line 205
    if-eqz v2, :cond_6

    .line 206
    .line 207
    move-object p1, v1

    .line 208
    check-cast p1, La/ith;

    .line 209
    .line 210
    iget-object p1, p1, La/ith;->e:Landroid/widget/TextView;

    .line 211
    .line 212
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    check-cast v2, La/kov;

    .line 217
    .line 218
    iget-object v2, v2, La/kov;->e:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_6
    instance-of p1, p1, La/eov;

    .line 225
    .line 226
    if-eqz p1, :cond_7

    .line 227
    .line 228
    move-object p1, v1

    .line 229
    check-cast p1, La/ith;

    .line 230
    .line 231
    iget-object p1, p1, La/ith;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 232
    .line 233
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 234
    .line 235
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, La/kov;

    .line 240
    .line 241
    iget v3, v3, La/kov;->f:I

    .line 242
    .line 243
    invoke-static {v3, v2}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 248
    .line 249
    .line 250
    goto :goto_1

    .line 251
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 252
    .line 253
    .line 254
    const/4 p0, 0x0

    .line 255
    return-object p0

    .line 256
    :cond_8
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0
.end method

.method private final v(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v2, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x2

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    move-object p1, v2

    .line 22
    check-cast p1, La/jth;

    .line 23
    .line 24
    iget-object p1, p1, La/jth;->f:Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/cov;

    .line 31
    .line 32
    iget-object v0, v0, La/cov;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, La/vtb;->O(La/cp;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v2

    .line 41
    check-cast p1, La/jth;

    .line 42
    .line 43
    iget-object p1, p1, La/jth;->f:Landroid/widget/TextView;

    .line 44
    .line 45
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/cov;

    .line 50
    .line 51
    iget v0, v0, La/cov;->d:I

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 54
    .line 55
    .line 56
    move-object p1, v2

    .line 57
    check-cast p1, La/jth;

    .line 58
    .line 59
    iget-object p1, p1, La/jth;->h:Landroid/widget/TextView;

    .line 60
    .line 61
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/cov;

    .line 66
    .line 67
    iget-object v0, v0, La/cov;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, La/vtb;->P(La/cp;)V

    .line 73
    .line 74
    .line 75
    move-object p1, v2

    .line 76
    check-cast p1, La/jth;

    .line 77
    .line 78
    iget-object p1, p1, La/jth;->h:Landroid/widget/TextView;

    .line 79
    .line 80
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, La/cov;

    .line 85
    .line 86
    iget v0, v0, La/cov;->g:I

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 89
    .line 90
    .line 91
    move-object p1, v2

    .line 92
    check-cast p1, La/jth;

    .line 93
    .line 94
    iget-object p1, p1, La/jth;->d:Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/cov;

    .line 101
    .line 102
    iget-object v0, v0, La/cov;->h:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    move-object p1, v2

    .line 108
    check-cast p1, La/jth;

    .line 109
    .line 110
    iget-object p1, p1, La/jth;->e:Landroid/widget/TextView;

    .line 111
    .line 112
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, La/cov;

    .line 117
    .line 118
    iget-object v0, v0, La/cov;->i:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    move-object p1, v2

    .line 124
    check-cast p1, La/jth;

    .line 125
    .line 126
    iget-object p1, p1, La/jth;->g:Landroid/widget/TextView;

    .line 127
    .line 128
    new-instance v0, La/zre;

    .line 129
    .line 130
    invoke-direct {v0, p0, v4}, La/zre;-><init>(La/cp;B)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 134
    .line 135
    .line 136
    check-cast v2, La/jth;

    .line 137
    .line 138
    iget-object p1, v2, La/jth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 139
    .line 140
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 141
    .line 142
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    check-cast p0, La/cov;

    .line 147
    .line 148
    iget p0, p0, La/cov;->k:I

    .line 149
    .line 150
    invoke-static {p0, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_1

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    check-cast v2, Ljava/util/Collection;

    .line 182
    .line 183
    check-cast v2, Ljava/lang/Iterable;

    .line 184
    .line 185
    invoke-static {p0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p1, :cond_c

    .line 198
    .line 199
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, La/bov;

    .line 204
    .line 205
    if-eqz p1, :cond_b

    .line 206
    .line 207
    instance-of v2, p1, La/tnv;

    .line 208
    .line 209
    if-eqz v2, :cond_2

    .line 210
    .line 211
    move-object p1, v1

    .line 212
    check-cast p1, La/jth;

    .line 213
    .line 214
    iget-object p1, p1, La/jth;->f:Landroid/widget/TextView;

    .line 215
    .line 216
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, La/cov;

    .line 221
    .line 222
    iget-object v2, v2, La/cov;->c:Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_2
    instance-of v2, p1, La/snv;

    .line 229
    .line 230
    if-eqz v2, :cond_3

    .line 231
    .line 232
    invoke-static {v0}, La/vtb;->O(La/cp;)V

    .line 233
    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_3
    instance-of v2, p1, La/unv;

    .line 237
    .line 238
    if-eqz v2, :cond_4

    .line 239
    .line 240
    move-object p1, v1

    .line 241
    check-cast p1, La/jth;

    .line 242
    .line 243
    iget-object p1, p1, La/jth;->f:Landroid/widget/TextView;

    .line 244
    .line 245
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    check-cast v2, La/cov;

    .line 250
    .line 251
    iget v2, v2, La/cov;->d:I

    .line 252
    .line 253
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 254
    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_4
    instance-of v2, p1, La/xnv;

    .line 258
    .line 259
    if-eqz v2, :cond_5

    .line 260
    .line 261
    move-object p1, v1

    .line 262
    check-cast p1, La/jth;

    .line 263
    .line 264
    iget-object p1, p1, La/jth;->h:Landroid/widget/TextView;

    .line 265
    .line 266
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    check-cast v2, La/cov;

    .line 271
    .line 272
    iget-object v2, v2, La/cov;->f:Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 275
    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_5
    instance-of v2, p1, La/wnv;

    .line 279
    .line 280
    if-eqz v2, :cond_6

    .line 281
    .line 282
    invoke-static {v0}, La/vtb;->P(La/cp;)V

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_6
    instance-of v2, p1, La/ynv;

    .line 287
    .line 288
    if-eqz v2, :cond_7

    .line 289
    .line 290
    move-object p1, v1

    .line 291
    check-cast p1, La/jth;

    .line 292
    .line 293
    iget-object p1, p1, La/jth;->h:Landroid/widget/TextView;

    .line 294
    .line 295
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    check-cast v2, La/cov;

    .line 300
    .line 301
    iget v2, v2, La/cov;->g:I

    .line 302
    .line 303
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_7
    instance-of v2, p1, La/aov;

    .line 308
    .line 309
    if-eqz v2, :cond_8

    .line 310
    .line 311
    move-object p1, v1

    .line 312
    check-cast p1, La/jth;

    .line 313
    .line 314
    iget-object p1, p1, La/jth;->d:Landroid/widget/TextView;

    .line 315
    .line 316
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    check-cast v2, La/cov;

    .line 321
    .line 322
    iget-object v2, v2, La/cov;->h:Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :cond_8
    instance-of v2, p1, La/znv;

    .line 330
    .line 331
    if-eqz v2, :cond_9

    .line 332
    .line 333
    move-object p1, v1

    .line 334
    check-cast p1, La/jth;

    .line 335
    .line 336
    iget-object p1, p1, La/jth;->e:Landroid/widget/TextView;

    .line 337
    .line 338
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    check-cast v2, La/cov;

    .line 343
    .line 344
    iget-object v2, v2, La/cov;->i:Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :cond_9
    instance-of v2, p1, La/vnv;

    .line 352
    .line 353
    if-eqz v2, :cond_a

    .line 354
    .line 355
    move-object p1, v1

    .line 356
    check-cast p1, La/jth;

    .line 357
    .line 358
    iget-object p1, p1, La/jth;->g:Landroid/widget/TextView;

    .line 359
    .line 360
    new-instance v2, La/zre;

    .line 361
    .line 362
    invoke-direct {v2, v0, v4}, La/zre;-><init>(La/cp;B)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 366
    .line 367
    .line 368
    goto/16 :goto_1

    .line 369
    .line 370
    :cond_a
    instance-of p1, p1, La/rnv;

    .line 371
    .line 372
    if-eqz p1, :cond_b

    .line 373
    .line 374
    move-object p1, v1

    .line 375
    check-cast p1, La/jth;

    .line 376
    .line 377
    iget-object p1, p1, La/jth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 378
    .line 379
    iget-object v2, v0, La/cp;->w:Landroid/content/Context;

    .line 380
    .line 381
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    check-cast v3, La/cov;

    .line 386
    .line 387
    iget v3, v3, La/cov;->k:I

    .line 388
    .line 389
    invoke-static {v3, v2}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    invoke-virtual {p1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 394
    .line 395
    .line 396
    goto/16 :goto_1

    .line 397
    .line 398
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 399
    .line 400
    .line 401
    const/4 p0, 0x0

    .line 402
    return-object p0

    .line 403
    :cond_c
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 404
    .line 405
    return-object p0
.end method

.method private final w(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->w:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 8
    .line 9
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 10
    .line 11
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v4, p0, La/cp;->u:La/yfu0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    invoke-static {p0}, La/xbc;->K(La/cp;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, La/xbc;->J(La/cp;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, La/xbc;->N(La/cp;)V

    .line 31
    .line 32
    .line 33
    move-object p1, v4

    .line 34
    check-cast p1, La/oth;

    .line 35
    .line 36
    iget-object p1, p1, La/oth;->g:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/ddh;

    .line 43
    .line 44
    iget-object v0, v0, La/ddh;->f:La/ank0;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    move-object p1, v4

    .line 54
    check-cast p1, La/oth;

    .line 55
    .line 56
    iget-object p1, p1, La/oth;->k:Landroid/widget/TextView;

    .line 57
    .line 58
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/ddh;

    .line 63
    .line 64
    iget-object v0, v0, La/ddh;->g:La/ank0;

    .line 65
    .line 66
    invoke-virtual {v0, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    move-object p1, v4

    .line 74
    check-cast p1, La/oth;

    .line 75
    .line 76
    iget-object p1, p1, La/oth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 77
    .line 78
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, La/ddh;

    .line 83
    .line 84
    iget v0, v0, La/ddh;->h:I

    .line 85
    .line 86
    invoke-static {v0, v3}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, La/xbc;->L(La/cp;)V

    .line 94
    .line 95
    .line 96
    check-cast v4, La/oth;

    .line 97
    .line 98
    iget-object p1, v4, La/oth;->i:Landroid/widget/TextView;

    .line 99
    .line 100
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, La/ddh;

    .line 105
    .line 106
    iget-object v0, v0, La/ddh;->j:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    invoke-static {p0}, La/xbc;->M(La/cp;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_2

    .line 115
    .line 116
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_1

    .line 130
    .line 131
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    check-cast v3, Ljava/util/Collection;

    .line 139
    .line 140
    check-cast v3, Ljava/lang/Iterable;

    .line 141
    .line 142
    invoke-static {p0, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_b

    .line 155
    .line 156
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, La/cdh;

    .line 161
    .line 162
    if-eqz p1, :cond_a

    .line 163
    .line 164
    instance-of v3, p1, La/uch;

    .line 165
    .line 166
    if-eqz v3, :cond_2

    .line 167
    .line 168
    invoke-static {v0}, La/xbc;->J(La/cp;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_2
    instance-of v3, p1, La/adh;

    .line 173
    .line 174
    if-eqz v3, :cond_3

    .line 175
    .line 176
    invoke-static {v0}, La/xbc;->N(La/cp;)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_3
    instance-of v3, p1, La/wch;

    .line 181
    .line 182
    if-eqz v3, :cond_4

    .line 183
    .line 184
    invoke-static {v0}, La/xbc;->K(La/cp;)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_4
    instance-of v3, p1, La/vch;

    .line 189
    .line 190
    if-eqz v3, :cond_5

    .line 191
    .line 192
    move-object p1, v2

    .line 193
    check-cast p1, La/oth;

    .line 194
    .line 195
    iget-object p1, p1, La/oth;->g:Landroid/widget/TextView;

    .line 196
    .line 197
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, La/ddh;

    .line 202
    .line 203
    iget-object v3, v3, La/ddh;->f:La/ank0;

    .line 204
    .line 205
    invoke-virtual {v3, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    instance-of v3, p1, La/bdh;

    .line 214
    .line 215
    if-eqz v3, :cond_6

    .line 216
    .line 217
    move-object p1, v2

    .line 218
    check-cast p1, La/oth;

    .line 219
    .line 220
    iget-object p1, p1, La/oth;->k:Landroid/widget/TextView;

    .line 221
    .line 222
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    check-cast v3, La/ddh;

    .line 227
    .line 228
    iget-object v3, v3, La/ddh;->g:La/ank0;

    .line 229
    .line 230
    invoke-virtual {v3, v1}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_6
    instance-of v3, p1, La/tch;

    .line 239
    .line 240
    if-eqz v3, :cond_7

    .line 241
    .line 242
    invoke-static {v0}, La/xbc;->K(La/cp;)V

    .line 243
    .line 244
    .line 245
    goto :goto_1

    .line 246
    :cond_7
    instance-of v3, p1, La/xch;

    .line 247
    .line 248
    if-eqz v3, :cond_8

    .line 249
    .line 250
    invoke-static {v0}, La/xbc;->L(La/cp;)V

    .line 251
    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_8
    instance-of v3, p1, La/ych;

    .line 255
    .line 256
    if-eqz v3, :cond_9

    .line 257
    .line 258
    move-object p1, v2

    .line 259
    check-cast p1, La/oth;

    .line 260
    .line 261
    iget-object p1, p1, La/oth;->i:Landroid/widget/TextView;

    .line 262
    .line 263
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    check-cast v3, La/ddh;

    .line 268
    .line 269
    iget-object v3, v3, La/ddh;->j:Ljava/lang/String;

    .line 270
    .line 271
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 272
    .line 273
    .line 274
    goto :goto_1

    .line 275
    :cond_9
    instance-of p1, p1, La/zch;

    .line 276
    .line 277
    if-eqz p1, :cond_a

    .line 278
    .line 279
    invoke-static {v0}, La/xbc;->M(La/cp;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_1

    .line 283
    .line 284
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 285
    .line 286
    .line 287
    const/4 p0, 0x0

    .line 288
    return-object p0

    .line 289
    :cond_b
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0
.end method

.method private final x(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v1, v0, La/cp;->w:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 8
    .line 9
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 10
    .line 11
    iget-object v3, p0, La/cp;->w:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v4, p0, La/cp;->u:La/yfu0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v6, 0x3

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    move-object p1, v4

    .line 26
    check-cast p1, La/qth;

    .line 27
    .line 28
    iget-object p1, p1, La/qth;->f:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/m4k0;

    .line 35
    .line 36
    iget-object v0, v0, La/m4k0;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, La/qcc;->I(La/cp;)V

    .line 42
    .line 43
    .line 44
    move-object p1, v4

    .line 45
    check-cast p1, La/qth;

    .line 46
    .line 47
    iget-object p1, p1, La/qth;->g:Landroid/widget/TextView;

    .line 48
    .line 49
    new-instance v0, La/zre;

    .line 50
    .line 51
    invoke-direct {v0, p0, v6}, La/zre;-><init>(La/cp;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    move-object p1, v4

    .line 58
    check-cast p1, La/qth;

    .line 59
    .line 60
    iget-object p1, p1, La/qth;->g:Landroid/widget/TextView;

    .line 61
    .line 62
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/m4k0;

    .line 67
    .line 68
    iget v0, v0, La/m4k0;->e:I

    .line 69
    .line 70
    invoke-static {v0, v3}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    move-object p1, v4

    .line 78
    check-cast p1, La/qth;

    .line 79
    .line 80
    iget-object p1, p1, La/qth;->d:Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/m4k0;

    .line 87
    .line 88
    iget-object v0, v0, La/m4k0;->f:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    move-object p1, v4

    .line 94
    check-cast p1, La/qth;

    .line 95
    .line 96
    iget-object p1, p1, La/qth;->c:Landroid/widget/TextView;

    .line 97
    .line 98
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/m4k0;

    .line 103
    .line 104
    iget-object v0, v0, La/m4k0;->g:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    .line 108
    .line 109
    move-object p1, v4

    .line 110
    check-cast p1, La/qth;

    .line 111
    .line 112
    iget-object p1, p1, La/qth;->e:Landroid/widget/TextView;

    .line 113
    .line 114
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/m4k0;

    .line 119
    .line 120
    iget-object v0, v0, La/m4k0;->h:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    check-cast v4, La/qth;

    .line 126
    .line 127
    iget-object p1, v4, La/qth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 128
    .line 129
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/m4k0;

    .line 134
    .line 135
    iget p0, p0, La/m4k0;->i:I

    .line 136
    .line 137
    invoke-static {p0, v3}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_2

    .line 145
    .line 146
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_1

    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    check-cast v3, Ljava/util/Collection;

    .line 169
    .line 170
    check-cast v3, Ljava/lang/Iterable;

    .line 171
    .line 172
    invoke-static {p0, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_a

    .line 185
    .line 186
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    check-cast p1, La/l4k0;

    .line 191
    .line 192
    if-eqz p1, :cond_9

    .line 193
    .line 194
    instance-of v3, p1, La/f4k0;

    .line 195
    .line 196
    if-eqz v3, :cond_2

    .line 197
    .line 198
    move-object p1, v2

    .line 199
    check-cast p1, La/qth;

    .line 200
    .line 201
    iget-object p1, p1, La/qth;->f:Landroid/widget/TextView;

    .line 202
    .line 203
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    check-cast v3, La/m4k0;

    .line 208
    .line 209
    iget-object v3, v3, La/m4k0;->c:Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_2
    instance-of v3, p1, La/e4k0;

    .line 216
    .line 217
    if-eqz v3, :cond_3

    .line 218
    .line 219
    invoke-static {v0}, La/qcc;->I(La/cp;)V

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_3
    instance-of v3, p1, La/g4k0;

    .line 224
    .line 225
    if-eqz v3, :cond_4

    .line 226
    .line 227
    move-object p1, v2

    .line 228
    check-cast p1, La/qth;

    .line 229
    .line 230
    iget-object p1, p1, La/qth;->g:Landroid/widget/TextView;

    .line 231
    .line 232
    new-instance v3, La/zre;

    .line 233
    .line 234
    invoke-direct {v3, v0, v6}, La/zre;-><init>(La/cp;B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :cond_4
    instance-of v3, p1, La/h4k0;

    .line 242
    .line 243
    if-eqz v3, :cond_5

    .line 244
    .line 245
    move-object p1, v2

    .line 246
    check-cast p1, La/qth;

    .line 247
    .line 248
    iget-object p1, p1, La/qth;->g:Landroid/widget/TextView;

    .line 249
    .line 250
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    check-cast v3, La/m4k0;

    .line 255
    .line 256
    iget v3, v3, La/m4k0;->e:I

    .line 257
    .line 258
    invoke-static {v3, v1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 263
    .line 264
    .line 265
    goto :goto_1

    .line 266
    :cond_5
    instance-of v3, p1, La/k4k0;

    .line 267
    .line 268
    if-eqz v3, :cond_6

    .line 269
    .line 270
    move-object p1, v2

    .line 271
    check-cast p1, La/qth;

    .line 272
    .line 273
    iget-object p1, p1, La/qth;->d:Landroid/widget/TextView;

    .line 274
    .line 275
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    check-cast v3, La/m4k0;

    .line 280
    .line 281
    iget-object v3, v3, La/m4k0;->f:Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 284
    .line 285
    .line 286
    goto :goto_1

    .line 287
    :cond_6
    instance-of v3, p1, La/j4k0;

    .line 288
    .line 289
    if-eqz v3, :cond_7

    .line 290
    .line 291
    move-object p1, v2

    .line 292
    check-cast p1, La/qth;

    .line 293
    .line 294
    iget-object p1, p1, La/qth;->c:Landroid/widget/TextView;

    .line 295
    .line 296
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    check-cast v3, La/m4k0;

    .line 301
    .line 302
    iget-object v3, v3, La/m4k0;->g:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    .line 306
    .line 307
    goto :goto_1

    .line 308
    :cond_7
    instance-of v3, p1, La/i4k0;

    .line 309
    .line 310
    if-eqz v3, :cond_8

    .line 311
    .line 312
    move-object p1, v2

    .line 313
    check-cast p1, La/qth;

    .line 314
    .line 315
    iget-object p1, p1, La/qth;->e:Landroid/widget/TextView;

    .line 316
    .line 317
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    check-cast v3, La/m4k0;

    .line 322
    .line 323
    iget-object v3, v3, La/m4k0;->h:Ljava/lang/String;

    .line 324
    .line 325
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_1

    .line 329
    .line 330
    :cond_8
    instance-of p1, p1, La/d4k0;

    .line 331
    .line 332
    if-eqz p1, :cond_9

    .line 333
    .line 334
    move-object p1, v2

    .line 335
    check-cast p1, La/qth;

    .line 336
    .line 337
    iget-object p1, p1, La/qth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 338
    .line 339
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    check-cast v3, La/m4k0;

    .line 344
    .line 345
    iget v3, v3, La/m4k0;->i:I

    .line 346
    .line 347
    invoke-static {v3, v1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 357
    .line 358
    .line 359
    const/4 p0, 0x0

    .line 360
    return-object p0

    .line 361
    :cond_a
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object p0
.end method

.method private final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 13
    .line 14
    invoke-static {p0}, La/vcc;->z(La/cp;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    check-cast p1, La/pth;

    .line 20
    .line 21
    iget-object p1, p1, La/pth;->a:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    iget-object v0, p0, La/cp;->w:Landroid/content/Context;

    .line 24
    .line 25
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/q4k0;

    .line 30
    .line 31
    iget p0, p0, La/q4k0;->b:I

    .line 32
    .line 33
    invoke-static {p0, v0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v1, Ljava/util/Collection;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-static {v0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/p4k0;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    instance-of v1, v0, La/o4k0;

    .line 90
    .line 91
    iget-object v2, p0, La/ok;->c:La/cp;

    .line 92
    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    invoke-static {v2}, La/vcc;->z(La/cp;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    instance-of v0, v0, La/n4k0;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    iget-object v0, v2, La/cp;->u:La/yfu0;

    .line 104
    .line 105
    check-cast v0, La/pth;

    .line 106
    .line 107
    iget-object v0, v0, La/pth;->a:Landroid/widget/FrameLayout;

    .line 108
    .line 109
    iget-object v1, v2, La/cp;->w:Landroid/content/Context;

    .line 110
    .line 111
    invoke-virtual {v2}, La/cp;->u()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, La/q4k0;

    .line 116
    .line 117
    iget v2, v2, La/q4k0;->b:I

    .line 118
    .line 119
    invoke-static {v2, v1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 128
    .line 129
    .line 130
    const/4 p0, 0x0

    .line 131
    return-object p0

    .line 132
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object p0
.end method

.method private final z(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/ok;->c:La/cp;

    .line 4
    .line 5
    iget-object v0, v0, La/cp;->u:La/yfu0;

    .line 6
    .line 7
    iget-object p0, p0, La/ok;->b:La/cp;

    .line 8
    .line 9
    iget-object v1, p0, La/cp;->u:La/yfu0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/ofh;

    .line 25
    .line 26
    iget-object p1, p1, La/ofh;->b:Ljava/util/ArrayList;

    .line 27
    .line 28
    move-object v0, v1

    .line 29
    check-cast v0, La/rfh;

    .line 30
    .line 31
    iget-object v0, v0, La/rfh;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->setHeaders(Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ofh;

    .line 41
    .line 42
    iget-object p0, p0, La/ofh;->c:Ljava/util/List;

    .line 43
    .line 44
    check-cast v1, La/rfh;

    .line 45
    .line 46
    iget-object p1, v1, La/rfh;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->setTeams(Ljava/util/List;)V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast v1, Ljava/util/Collection;

    .line 75
    .line 76
    check-cast v1, Ljava/lang/Iterable;

    .line 77
    .line 78
    invoke-static {p0, v1}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_4

    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, La/nfh;

    .line 97
    .line 98
    if-eqz p1, :cond_3

    .line 99
    .line 100
    instance-of v1, p1, La/lfh;

    .line 101
    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    check-cast p1, La/lfh;

    .line 105
    .line 106
    iget-object p1, p1, La/lfh;->a:Ljava/util/ArrayList;

    .line 107
    .line 108
    move-object v1, v0

    .line 109
    check-cast v1, La/rfh;

    .line 110
    .line 111
    iget-object v1, v1, La/rfh;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;

    .line 112
    .line 113
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->setHeaders(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    instance-of v1, p1, La/mfh;

    .line 118
    .line 119
    if-eqz v1, :cond_3

    .line 120
    .line 121
    check-cast p1, La/mfh;

    .line 122
    .line 123
    iget-object p1, p1, La/mfh;->a:Ljava/util/List;

    .line 124
    .line 125
    move-object v1, v0

    .line 126
    check-cast v1, La/rfh;

    .line 127
    .line 128
    iget-object v1, v1, La/rfh;->a:Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;

    .line 129
    .line 130
    invoke-virtual {v1, p1}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->setTeams(Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 135
    .line 136
    .line 137
    const/4 p0, 0x0

    .line 138
    return-object p0

    .line 139
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ok;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v5, 0x8

    .line 7
    .line 8
    const/16 v7, 0xb

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    iget-object v9, v0, La/ok;->c:La/cp;

    .line 12
    .line 13
    iget-object v10, v0, La/ok;->b:La/cp;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/e1l;

    .line 36
    .line 37
    iget-object v1, v10, La/cp;->u:La/yfu0;

    .line 38
    .line 39
    check-cast v1, La/jg3;

    .line 40
    .line 41
    iget-object v1, v1, La/jg3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 42
    .line 43
    iget v0, v0, La/e1l;->a:I

    .line 44
    .line 45
    invoke-static {v1, v0}, La/vcc;->d0(Landroid/widget/ImageView;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    check-cast v2, Ljava/util/Collection;

    .line 72
    .line 73
    check-cast v2, Ljava/lang/Iterable;

    .line 74
    .line 75
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, La/d1l;

    .line 94
    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, La/e1l;

    .line 102
    .line 103
    iget-object v2, v9, La/cp;->u:La/yfu0;

    .line 104
    .line 105
    check-cast v2, La/jg3;

    .line 106
    .line 107
    iget-object v2, v2, La/jg3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 108
    .line 109
    iget v1, v1, La/e1l;->a:I

    .line 110
    .line 111
    invoke-static {v2, v1}, La/vcc;->d0(Landroid/widget/ImageView;I)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 116
    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    :goto_2
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    :goto_3
    return-object v11

    .line 123
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/ok;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    return-object v0

    .line 128
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/ok;->A(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0

    .line 133
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/ok;->z(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/ok;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0

    .line 143
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/ok;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/ok;->w(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/ok;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/ok;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :pswitch_8
    invoke-direct/range {p0 .. p1}, La/ok;->t(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :pswitch_9
    invoke-direct/range {p0 .. p1}, La/ok;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    return-object v0

    .line 173
    :pswitch_a
    invoke-direct/range {p0 .. p1}, La/ok;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    return-object v0

    .line 178
    :pswitch_b
    invoke-direct/range {p0 .. p1}, La/ok;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    return-object v0

    .line 183
    :pswitch_c
    invoke-direct/range {p0 .. p1}, La/ok;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_d
    invoke-direct/range {p0 .. p1}, La/ok;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0

    .line 193
    :pswitch_e
    invoke-direct/range {p0 .. p1}, La/ok;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    return-object v0

    .line 198
    :pswitch_f
    invoke-direct/range {p0 .. p1}, La/ok;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    return-object v0

    .line 203
    :pswitch_10
    invoke-direct/range {p0 .. p1}, La/ok;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    return-object v0

    .line 208
    :pswitch_11
    invoke-direct/range {p0 .. p1}, La/ok;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :pswitch_12
    invoke-direct/range {p0 .. p1}, La/ok;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    :pswitch_13
    invoke-direct/range {p0 .. p1}, La/ok;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0

    .line 223
    :pswitch_14
    invoke-direct/range {p0 .. p1}, La/ok;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    return-object v0

    .line 228
    :pswitch_15
    move-object/from16 v0, p1

    .line 229
    .line 230
    check-cast v0, Ljava/util/List;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    if-eqz v1, :cond_5

    .line 240
    .line 241
    iget-object v0, v10, La/cp;->u:La/yfu0;

    .line 242
    .line 243
    move-object v1, v0

    .line 244
    check-cast v1, La/osx;

    .line 245
    .line 246
    iget-object v2, v1, La/osx;->k:Landroid/widget/TextView;

    .line 247
    .line 248
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    check-cast v3, La/qca;

    .line 253
    .line 254
    iget-object v3, v3, La/qca;->b:La/ank0;

    .line 255
    .line 256
    iget-object v4, v10, La/cp;->w:Landroid/content/Context;

    .line 257
    .line 258
    invoke-virtual {v3, v4}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 266
    .line 267
    iget-object v2, v1, La/osx;->d:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 268
    .line 269
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    check-cast v3, La/qca;

    .line 274
    .line 275
    iget-object v3, v3, La/qca;->d:La/ohm0;

    .line 276
    .line 277
    invoke-virtual {v3}, La/ohm0;->q()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {v2, v3, v8, v7}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 282
    .line 283
    .line 284
    iget-object v2, v1, La/osx;->f:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 285
    .line 286
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    check-cast v3, La/qca;

    .line 291
    .line 292
    iget-object v3, v3, La/qca;->d:La/ohm0;

    .line 293
    .line 294
    invoke-virtual {v3}, La/ohm0;->v()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-static {v2, v3, v8, v7}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 299
    .line 300
    .line 301
    iget-object v2, v1, La/osx;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 302
    .line 303
    invoke-static {v2}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, La/qca;

    .line 311
    .line 312
    iget-object v3, v3, La/qca;->e:La/ank0;

    .line 313
    .line 314
    invoke-virtual {v3, v4}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    .line 320
    .line 321
    iget-object v2, v1, La/osx;->n:Landroidx/appcompat/widget/AppCompatTextView;

    .line 322
    .line 323
    invoke-static {v2}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    check-cast v3, La/qca;

    .line 331
    .line 332
    iget-object v3, v3, La/qca;->f:La/ank0;

    .line 333
    .line 334
    invoke-virtual {v3, v4}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 339
    .line 340
    .line 341
    iget-object v2, v1, La/osx;->i:Landroid/widget/TextView;

    .line 342
    .line 343
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    check-cast v3, La/qca;

    .line 348
    .line 349
    iget-object v3, v3, La/qca;->d:La/ohm0;

    .line 350
    .line 351
    invoke-virtual {v3}, La/ohm0;->r()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 356
    .line 357
    .line 358
    iget-object v2, v1, La/osx;->m:Landroid/widget/TextView;

    .line 359
    .line 360
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    check-cast v3, La/qca;

    .line 365
    .line 366
    iget-object v3, v3, La/qca;->d:La/ohm0;

    .line 367
    .line 368
    invoke-virtual {v3}, La/ohm0;->w()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 373
    .line 374
    .line 375
    iget-object v2, v1, La/osx;->c:Landroid/widget/ImageView;

    .line 376
    .line 377
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    check-cast v3, La/qca;

    .line 382
    .line 383
    iget-object v3, v3, La/qca;->d:La/ohm0;

    .line 384
    .line 385
    invoke-virtual {v3}, La/ohm0;->o()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 390
    .line 391
    .line 392
    iget-object v2, v1, La/osx;->e:Landroid/widget/ImageView;

    .line 393
    .line 394
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    check-cast v3, La/qca;

    .line 399
    .line 400
    iget-object v3, v3, La/qca;->d:La/ohm0;

    .line 401
    .line 402
    invoke-virtual {v3}, La/ohm0;->t()I

    .line 403
    .line 404
    .line 405
    move-result v3

    .line 406
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 407
    .line 408
    .line 409
    iget-object v1, v1, La/osx;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 410
    .line 411
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    check-cast v2, La/qca;

    .line 416
    .line 417
    iget-object v2, v2, La/qca;->c:La/ank0;

    .line 418
    .line 419
    invoke-virtual {v2, v4}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 424
    .line 425
    .line 426
    check-cast v0, La/osx;

    .line 427
    .line 428
    iget-object v0, v0, La/osx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 429
    .line 430
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    check-cast v1, La/qca;

    .line 435
    .line 436
    iget-boolean v1, v1, La/qca;->h:Z

    .line 437
    .line 438
    if-eqz v1, :cond_4

    .line 439
    .line 440
    const/4 v6, 0x2

    .line 441
    goto :goto_4

    .line 442
    :cond_4
    move v6, v8

    .line 443
    :goto_4
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutDirection(I)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_8

    .line 447
    .line 448
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-eqz v2, :cond_6

    .line 462
    .line 463
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    check-cast v2, Ljava/util/Collection;

    .line 471
    .line 472
    check-cast v2, Ljava/lang/Iterable;

    .line 473
    .line 474
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 475
    .line 476
    .line 477
    goto :goto_5

    .line 478
    :cond_6
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    if-eqz v1, :cond_11

    .line 487
    .line 488
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    check-cast v1, Ljava/util/List;

    .line 493
    .line 494
    new-instance v2, Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 497
    .line 498
    .line 499
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    :cond_8
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v3

    .line 507
    if-eqz v3, :cond_9

    .line 508
    .line 509
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    instance-of v4, v3, La/wes;

    .line 514
    .line 515
    if-eqz v4, :cond_8

    .line 516
    .line 517
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    goto :goto_6

    .line 521
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-eqz v2, :cond_7

    .line 530
    .line 531
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    check-cast v2, La/wes;

    .line 536
    .line 537
    iget-object v3, v9, La/cp;->w:Landroid/content/Context;

    .line 538
    .line 539
    iget-object v4, v9, La/cp;->u:La/yfu0;

    .line 540
    .line 541
    if-eqz v2, :cond_10

    .line 542
    .line 543
    instance-of v5, v2, La/qes;

    .line 544
    .line 545
    if-eqz v5, :cond_a

    .line 546
    .line 547
    check-cast v4, La/osx;

    .line 548
    .line 549
    iget-object v3, v4, La/osx;->c:Landroid/widget/ImageView;

    .line 550
    .line 551
    check-cast v2, La/qes;

    .line 552
    .line 553
    iget v2, v2, La/qes;->a:I

    .line 554
    .line 555
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 556
    .line 557
    .line 558
    goto :goto_7

    .line 559
    :cond_a
    instance-of v5, v2, La/tes;

    .line 560
    .line 561
    if-eqz v5, :cond_b

    .line 562
    .line 563
    check-cast v4, La/osx;

    .line 564
    .line 565
    iget-object v3, v4, La/osx;->e:Landroid/widget/ImageView;

    .line 566
    .line 567
    check-cast v2, La/tes;

    .line 568
    .line 569
    iget v2, v2, La/tes;->a:I

    .line 570
    .line 571
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 572
    .line 573
    .line 574
    goto :goto_7

    .line 575
    :cond_b
    instance-of v5, v2, La/res;

    .line 576
    .line 577
    if-eqz v5, :cond_c

    .line 578
    .line 579
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 580
    .line 581
    check-cast v4, La/osx;

    .line 582
    .line 583
    iget-object v3, v4, La/osx;->d:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 584
    .line 585
    check-cast v2, La/res;

    .line 586
    .line 587
    iget-object v2, v2, La/res;->a:Ljava/lang/String;

    .line 588
    .line 589
    invoke-static {v3, v2, v8, v7}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 590
    .line 591
    .line 592
    goto :goto_7

    .line 593
    :cond_c
    instance-of v5, v2, La/ues;

    .line 594
    .line 595
    if-eqz v5, :cond_d

    .line 596
    .line 597
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 598
    .line 599
    check-cast v4, La/osx;

    .line 600
    .line 601
    iget-object v3, v4, La/osx;->f:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 602
    .line 603
    check-cast v2, La/ues;

    .line 604
    .line 605
    iget-object v2, v2, La/ues;->a:Ljava/lang/String;

    .line 606
    .line 607
    invoke-static {v3, v2, v8, v7}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 608
    .line 609
    .line 610
    goto :goto_7

    .line 611
    :cond_d
    instance-of v5, v2, La/ses;

    .line 612
    .line 613
    if-eqz v5, :cond_e

    .line 614
    .line 615
    check-cast v4, La/osx;

    .line 616
    .line 617
    iget-object v4, v4, La/osx;->j:Landroidx/appcompat/widget/AppCompatTextView;

    .line 618
    .line 619
    check-cast v2, La/ses;

    .line 620
    .line 621
    iget-object v2, v2, La/ses;->a:La/ank0;

    .line 622
    .line 623
    invoke-virtual {v2, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 628
    .line 629
    .line 630
    goto :goto_7

    .line 631
    :cond_e
    instance-of v5, v2, La/ves;

    .line 632
    .line 633
    if-eqz v5, :cond_f

    .line 634
    .line 635
    check-cast v4, La/osx;

    .line 636
    .line 637
    iget-object v4, v4, La/osx;->n:Landroidx/appcompat/widget/AppCompatTextView;

    .line 638
    .line 639
    check-cast v2, La/ves;

    .line 640
    .line 641
    iget-object v2, v2, La/ves;->a:La/ank0;

    .line 642
    .line 643
    invoke-virtual {v2, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 648
    .line 649
    .line 650
    goto :goto_7

    .line 651
    :cond_f
    instance-of v5, v2, La/pes;

    .line 652
    .line 653
    if-eqz v5, :cond_10

    .line 654
    .line 655
    check-cast v4, La/osx;

    .line 656
    .line 657
    iget-object v4, v4, La/osx;->l:Landroidx/appcompat/widget/AppCompatTextView;

    .line 658
    .line 659
    check-cast v2, La/pes;

    .line 660
    .line 661
    iget-object v2, v2, La/pes;->a:La/ank0;

    .line 662
    .line 663
    invoke-virtual {v2, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_7

    .line 671
    .line 672
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 673
    .line 674
    .line 675
    const/4 v11, 0x0

    .line 676
    goto :goto_9

    .line 677
    :cond_11
    :goto_8
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 678
    .line 679
    :goto_9
    return-object v11

    .line 680
    :pswitch_16
    move-object/from16 v0, p1

    .line 681
    .line 682
    check-cast v0, Ljava/util/List;

    .line 683
    .line 684
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 688
    .line 689
    .line 690
    move-result v1

    .line 691
    if-eqz v1, :cond_12

    .line 692
    .line 693
    iget-object v0, v10, La/cp;->u:La/yfu0;

    .line 694
    .line 695
    check-cast v0, La/psx;

    .line 696
    .line 697
    iget-object v0, v0, La/psx;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 698
    .line 699
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    check-cast v1, La/kfa;

    .line 704
    .line 705
    iget-object v1, v1, La/kfa;->b:Ljava/lang/String;

    .line 706
    .line 707
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 708
    .line 709
    .line 710
    goto :goto_d

    .line 711
    :cond_12
    new-instance v1, Ljava/util/ArrayList;

    .line 712
    .line 713
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 714
    .line 715
    .line 716
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 721
    .line 722
    .line 723
    move-result v2

    .line 724
    if-eqz v2, :cond_13

    .line 725
    .line 726
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    check-cast v2, Ljava/util/Collection;

    .line 734
    .line 735
    check-cast v2, Ljava/lang/Iterable;

    .line 736
    .line 737
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 738
    .line 739
    .line 740
    goto :goto_a

    .line 741
    :cond_13
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    if-eqz v1, :cond_17

    .line 750
    .line 751
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    check-cast v1, Ljava/util/List;

    .line 756
    .line 757
    new-instance v2, Ljava/util/ArrayList;

    .line 758
    .line 759
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 760
    .line 761
    .line 762
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    :cond_15
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 767
    .line 768
    .line 769
    move-result v3

    .line 770
    if-eqz v3, :cond_16

    .line 771
    .line 772
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    instance-of v4, v3, La/xes;

    .line 777
    .line 778
    if-eqz v4, :cond_15

    .line 779
    .line 780
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    goto :goto_b

    .line 784
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    if-eqz v2, :cond_14

    .line 793
    .line 794
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v2

    .line 798
    check-cast v2, La/xes;

    .line 799
    .line 800
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 801
    .line 802
    .line 803
    iget-object v3, v9, La/cp;->u:La/yfu0;

    .line 804
    .line 805
    check-cast v3, La/psx;

    .line 806
    .line 807
    iget-object v3, v3, La/psx;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 808
    .line 809
    iget-object v2, v2, La/xes;->a:Ljava/lang/String;

    .line 810
    .line 811
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 812
    .line 813
    .line 814
    goto :goto_c

    .line 815
    :cond_17
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 816
    .line 817
    return-object v0

    .line 818
    :pswitch_17
    move-object/from16 v0, p1

    .line 819
    .line 820
    check-cast v0, Ljava/util/List;

    .line 821
    .line 822
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    if-eqz v1, :cond_1a

    .line 830
    .line 831
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    check-cast v0, La/jda;

    .line 836
    .line 837
    iget-object v1, v0, La/jda;->b:Ljava/lang/String;

    .line 838
    .line 839
    iget-object v2, v0, La/jda;->e:Ljava/lang/String;

    .line 840
    .line 841
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 842
    .line 843
    .line 844
    move-result v3

    .line 845
    iget-object v4, v10, La/cp;->u:La/yfu0;

    .line 846
    .line 847
    if-lez v3, :cond_18

    .line 848
    .line 849
    move-object v3, v4

    .line 850
    check-cast v3, La/nsx;

    .line 851
    .line 852
    iget-object v5, v3, La/nsx;->b:Landroid/widget/TextView;

    .line 853
    .line 854
    invoke-virtual {v5, v8}, Landroid/view/View;->setVisibility(I)V

    .line 855
    .line 856
    .line 857
    iget-object v3, v3, La/nsx;->b:Landroid/widget/TextView;

    .line 858
    .line 859
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 860
    .line 861
    .line 862
    goto :goto_e

    .line 863
    :cond_18
    move-object v1, v4

    .line 864
    check-cast v1, La/nsx;

    .line 865
    .line 866
    iget-object v1, v1, La/nsx;->b:Landroid/widget/TextView;

    .line 867
    .line 868
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 869
    .line 870
    .line 871
    :goto_e
    check-cast v4, La/nsx;

    .line 872
    .line 873
    iget-object v1, v4, La/nsx;->c:Landroid/widget/TextView;

    .line 874
    .line 875
    iget-object v3, v0, La/jda;->c:Ljava/lang/String;

    .line 876
    .line 877
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 878
    .line 879
    .line 880
    iget-object v1, v4, La/nsx;->e:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 881
    .line 882
    iget-object v3, v0, La/jda;->f:La/hg30;

    .line 883
    .line 884
    invoke-virtual {v1, v3}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 888
    .line 889
    .line 890
    move-result v1

    .line 891
    iget-object v3, v4, La/nsx;->d:Landroid/widget/TextView;

    .line 892
    .line 893
    if-lez v1, :cond_19

    .line 894
    .line 895
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 896
    .line 897
    .line 898
    goto/16 :goto_12

    .line 899
    .line 900
    :cond_19
    sget-object v1, La/rdj;->a:La/rdj;

    .line 901
    .line 902
    iget-object v1, v10, La/cp;->w:Landroid/content/Context;

    .line 903
    .line 904
    invoke-static {v1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 905
    .line 906
    .line 907
    move-result v1

    .line 908
    iget-wide v4, v0, La/jda;->d:J

    .line 909
    .line 910
    sget-object v0, La/efj;->c:La/efj;

    .line 911
    .line 912
    new-instance v2, La/znq0;

    .line 913
    .line 914
    invoke-direct {v2, v4, v5}, La/znq0;-><init>(J)V

    .line 915
    .line 916
    .line 917
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    const/16 v4, 0x38

    .line 922
    .line 923
    invoke-static {v2, v0, v1, v8, v4}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 928
    .line 929
    .line 930
    goto/16 :goto_12

    .line 931
    .line 932
    :cond_1a
    new-instance v1, Ljava/util/ArrayList;

    .line 933
    .line 934
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 935
    .line 936
    .line 937
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 942
    .line 943
    .line 944
    move-result v2

    .line 945
    if-eqz v2, :cond_1b

    .line 946
    .line 947
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 952
    .line 953
    .line 954
    check-cast v2, Ljava/util/Collection;

    .line 955
    .line 956
    check-cast v2, Ljava/lang/Iterable;

    .line 957
    .line 958
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 959
    .line 960
    .line 961
    goto :goto_f

    .line 962
    :cond_1b
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 967
    .line 968
    .line 969
    move-result v1

    .line 970
    if-eqz v1, :cond_20

    .line 971
    .line 972
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    check-cast v1, Ljava/util/List;

    .line 977
    .line 978
    new-instance v2, Ljava/util/ArrayList;

    .line 979
    .line 980
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 981
    .line 982
    .line 983
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    :cond_1d
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 988
    .line 989
    .line 990
    move-result v3

    .line 991
    if-eqz v3, :cond_1e

    .line 992
    .line 993
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v3

    .line 997
    instance-of v4, v3, La/nfs;

    .line 998
    .line 999
    if-eqz v4, :cond_1d

    .line 1000
    .line 1001
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    goto :goto_10

    .line 1005
    :cond_1e
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v2

    .line 1013
    if-eqz v2, :cond_1c

    .line 1014
    .line 1015
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    check-cast v2, La/nfs;

    .line 1020
    .line 1021
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1022
    .line 1023
    .line 1024
    instance-of v3, v2, La/nfs;

    .line 1025
    .line 1026
    if-eqz v3, :cond_1f

    .line 1027
    .line 1028
    iget-object v3, v9, La/cp;->u:La/yfu0;

    .line 1029
    .line 1030
    check-cast v3, La/nsx;

    .line 1031
    .line 1032
    iget-object v3, v3, La/nsx;->e:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 1033
    .line 1034
    iget-object v2, v2, La/nfs;->a:La/hg30;

    .line 1035
    .line 1036
    invoke-virtual {v3, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_11

    .line 1040
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1041
    .line 1042
    .line 1043
    const/4 v11, 0x0

    .line 1044
    goto :goto_13

    .line 1045
    :cond_20
    :goto_12
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1046
    .line 1047
    :goto_13
    return-object v11

    .line 1048
    :pswitch_18
    move-object/from16 v0, p1

    .line 1049
    .line 1050
    check-cast v0, Ljava/util/List;

    .line 1051
    .line 1052
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1053
    .line 1054
    .line 1055
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 1056
    .line 1057
    .line 1058
    move-result v1

    .line 1059
    if-eqz v1, :cond_2c

    .line 1060
    .line 1061
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    check-cast v0, La/yca;

    .line 1066
    .line 1067
    iget-object v1, v0, La/yca;->f:La/ank0;

    .line 1068
    .line 1069
    iget-object v2, v10, La/cp;->w:Landroid/content/Context;

    .line 1070
    .line 1071
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 1076
    .line 1077
    .line 1078
    move-result v9

    .line 1079
    iget-object v12, v10, La/cp;->u:La/yfu0;

    .line 1080
    .line 1081
    if-lez v9, :cond_21

    .line 1082
    .line 1083
    move-object v9, v12

    .line 1084
    check-cast v9, La/lsx;

    .line 1085
    .line 1086
    iget-object v13, v9, La/lsx;->r:Landroid/widget/TextView;

    .line 1087
    .line 1088
    invoke-virtual {v13, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1089
    .line 1090
    .line 1091
    iget-object v9, v9, La/lsx;->r:Landroid/widget/TextView;

    .line 1092
    .line 1093
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_14

    .line 1097
    :cond_21
    move-object v1, v12

    .line 1098
    check-cast v1, La/lsx;

    .line 1099
    .line 1100
    iget-object v1, v1, La/lsx;->r:Landroid/widget/TextView;

    .line 1101
    .line 1102
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1103
    .line 1104
    .line 1105
    :goto_14
    check-cast v12, La/lsx;

    .line 1106
    .line 1107
    iget-object v1, v12, La/lsx;->t:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1108
    .line 1109
    iget-object v9, v12, La/lsx;->s:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1110
    .line 1111
    iget-object v13, v12, La/lsx;->u:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1112
    .line 1113
    iget-object v14, v12, La/lsx;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1114
    .line 1115
    iget-object v15, v12, La/lsx;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1116
    .line 1117
    iget-object v6, v12, La/lsx;->n:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1118
    .line 1119
    iget-object v11, v12, La/lsx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1120
    .line 1121
    iget-object v7, v12, La/lsx;->m:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1122
    .line 1123
    iget-object v3, v12, La/lsx;->l:Landroid/widget/ImageView;

    .line 1124
    .line 1125
    iget-object v4, v12, La/lsx;->d:Landroid/widget/ImageView;

    .line 1126
    .line 1127
    invoke-static {v1}, La/jwb;->z(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 1128
    .line 1129
    .line 1130
    iget-object v1, v12, La/lsx;->t:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1131
    .line 1132
    iget-object v5, v0, La/yca;->b:La/ank0;

    .line 1133
    .line 1134
    invoke-virtual {v5, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v5

    .line 1138
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1139
    .line 1140
    .line 1141
    iget-object v1, v0, La/yca;->c:La/ohm0;

    .line 1142
    .line 1143
    instance-of v5, v1, La/tpp0;

    .line 1144
    .line 1145
    if-eqz v5, :cond_25

    .line 1146
    .line 1147
    check-cast v1, La/tpp0;

    .line 1148
    .line 1149
    iget v5, v1, La/tpp0;->g:I

    .line 1150
    .line 1151
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1152
    .line 1153
    .line 1154
    iget v5, v1, La/tpp0;->h:I

    .line 1155
    .line 1156
    invoke-virtual {v3, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v5

    .line 1163
    check-cast v5, La/yca;

    .line 1164
    .line 1165
    iget-boolean v5, v5, La/yca;->j:Z

    .line 1166
    .line 1167
    if-nez v5, :cond_22

    .line 1168
    .line 1169
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v5

    .line 1173
    check-cast v5, La/yca;

    .line 1174
    .line 1175
    iget-boolean v5, v5, La/yca;->h:Z

    .line 1176
    .line 1177
    if-nez v5, :cond_22

    .line 1178
    .line 1179
    move v5, v8

    .line 1180
    goto :goto_15

    .line 1181
    :cond_22
    const/16 v5, 0x8

    .line 1182
    .line 1183
    :goto_15
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    check-cast v4, La/yca;

    .line 1191
    .line 1192
    iget-boolean v4, v4, La/yca;->j:Z

    .line 1193
    .line 1194
    if-nez v4, :cond_23

    .line 1195
    .line 1196
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v4

    .line 1200
    check-cast v4, La/yca;

    .line 1201
    .line 1202
    iget-boolean v4, v4, La/yca;->h:Z

    .line 1203
    .line 1204
    if-nez v4, :cond_23

    .line 1205
    .line 1206
    move v4, v8

    .line 1207
    goto :goto_16

    .line 1208
    :cond_23
    const/16 v4, 0x8

    .line 1209
    .line 1210
    :goto_16
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v11, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1217
    .line 1218
    .line 1219
    const/16 v3, 0x8

    .line 1220
    .line 1221
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v15, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1225
    .line 1226
    .line 1227
    iget-object v3, v1, La/tpp0;->i:Ljava/lang/String;

    .line 1228
    .line 1229
    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1230
    .line 1231
    .line 1232
    iget-object v3, v1, La/tpp0;->j:Ljava/lang/String;

    .line 1233
    .line 1234
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {v10}, La/cp;->u()Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v3

    .line 1241
    check-cast v3, La/yca;

    .line 1242
    .line 1243
    iget-boolean v3, v3, La/yca;->h:Z

    .line 1244
    .line 1245
    if-eqz v3, :cond_24

    .line 1246
    .line 1247
    const v3, 0x7f080843

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v11, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1251
    .line 1252
    .line 1253
    const v1, 0x7f080842

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v7, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1257
    .line 1258
    .line 1259
    goto :goto_17

    .line 1260
    :cond_24
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1261
    .line 1262
    iget-object v3, v1, La/tpp0;->e:Ljava/lang/String;

    .line 1263
    .line 1264
    const/16 v4, 0xb

    .line 1265
    .line 1266
    invoke-static {v11, v3, v8, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1267
    .line 1268
    .line 1269
    iget-object v1, v1, La/tpp0;->f:Ljava/lang/String;

    .line 1270
    .line 1271
    invoke-static {v7, v1, v8, v4}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1272
    .line 1273
    .line 1274
    :goto_17
    move-object/from16 v16, v9

    .line 1275
    .line 1276
    move-object/from16 v18, v10

    .line 1277
    .line 1278
    goto/16 :goto_1c

    .line 1279
    .line 1280
    :cond_25
    instance-of v5, v1, La/spp0;

    .line 1281
    .line 1282
    if-eqz v5, :cond_2b

    .line 1283
    .line 1284
    check-cast v1, La/spp0;

    .line 1285
    .line 1286
    const/16 v5, 0x8

    .line 1287
    .line 1288
    invoke-virtual {v11, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1289
    .line 1290
    .line 1291
    iget-object v11, v12, La/lsx;->i:Landroid/widget/ImageView;

    .line 1292
    .line 1293
    iget-object v8, v12, La/lsx;->g:Landroid/widget/ImageView;

    .line 1294
    .line 1295
    move-object/from16 v18, v10

    .line 1296
    .line 1297
    iget-object v10, v12, La/lsx;->h:Landroid/widget/ImageView;

    .line 1298
    .line 1299
    move-object/from16 v16, v9

    .line 1300
    .line 1301
    iget-object v9, v12, La/lsx;->f:Landroid/widget/ImageView;

    .line 1302
    .line 1303
    invoke-virtual {v7, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1310
    .line 1311
    .line 1312
    const/4 v3, 0x0

    .line 1313
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v15, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1317
    .line 1318
    .line 1319
    iget-object v3, v1, La/spp0;->q:Ljava/lang/String;

    .line 1320
    .line 1321
    invoke-virtual {v14, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1322
    .line 1323
    .line 1324
    iget-object v3, v1, La/spp0;->r:Ljava/lang/String;

    .line 1325
    .line 1326
    invoke-virtual {v13, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1327
    .line 1328
    .line 1329
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v3

    .line 1333
    check-cast v3, La/yca;

    .line 1334
    .line 1335
    iget-boolean v3, v3, La/yca;->j:Z

    .line 1336
    .line 1337
    if-nez v3, :cond_26

    .line 1338
    .line 1339
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v3

    .line 1343
    check-cast v3, La/yca;

    .line 1344
    .line 1345
    iget-boolean v3, v3, La/yca;->h:Z

    .line 1346
    .line 1347
    if-nez v3, :cond_26

    .line 1348
    .line 1349
    const/4 v3, 0x0

    .line 1350
    goto :goto_18

    .line 1351
    :cond_26
    const/16 v3, 0x8

    .line 1352
    .line 1353
    :goto_18
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1354
    .line 1355
    .line 1356
    iget v3, v1, La/spp0;->m:I

    .line 1357
    .line 1358
    invoke-virtual {v9, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v3

    .line 1365
    check-cast v3, La/yca;

    .line 1366
    .line 1367
    iget-boolean v3, v3, La/yca;->j:Z

    .line 1368
    .line 1369
    if-nez v3, :cond_27

    .line 1370
    .line 1371
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v3

    .line 1375
    check-cast v3, La/yca;

    .line 1376
    .line 1377
    iget-boolean v3, v3, La/yca;->h:Z

    .line 1378
    .line 1379
    if-nez v3, :cond_27

    .line 1380
    .line 1381
    const/4 v3, 0x0

    .line 1382
    goto :goto_19

    .line 1383
    :cond_27
    const/16 v3, 0x8

    .line 1384
    .line 1385
    :goto_19
    invoke-virtual {v10, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1386
    .line 1387
    .line 1388
    iget v3, v1, La/spp0;->n:I

    .line 1389
    .line 1390
    invoke-virtual {v10, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v3

    .line 1397
    check-cast v3, La/yca;

    .line 1398
    .line 1399
    iget-boolean v3, v3, La/yca;->j:Z

    .line 1400
    .line 1401
    if-nez v3, :cond_28

    .line 1402
    .line 1403
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v3

    .line 1407
    check-cast v3, La/yca;

    .line 1408
    .line 1409
    iget-boolean v3, v3, La/yca;->h:Z

    .line 1410
    .line 1411
    if-nez v3, :cond_28

    .line 1412
    .line 1413
    const/4 v3, 0x0

    .line 1414
    goto :goto_1a

    .line 1415
    :cond_28
    const/16 v3, 0x8

    .line 1416
    .line 1417
    :goto_1a
    invoke-virtual {v8, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1418
    .line 1419
    .line 1420
    iget v3, v1, La/spp0;->o:I

    .line 1421
    .line 1422
    invoke-virtual {v8, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v3

    .line 1429
    check-cast v3, La/yca;

    .line 1430
    .line 1431
    iget-boolean v3, v3, La/yca;->j:Z

    .line 1432
    .line 1433
    if-nez v3, :cond_29

    .line 1434
    .line 1435
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v3

    .line 1439
    check-cast v3, La/yca;

    .line 1440
    .line 1441
    iget-boolean v3, v3, La/yca;->h:Z

    .line 1442
    .line 1443
    if-nez v3, :cond_29

    .line 1444
    .line 1445
    const/4 v5, 0x0

    .line 1446
    goto :goto_1b

    .line 1447
    :cond_29
    const/16 v5, 0x8

    .line 1448
    .line 1449
    :goto_1b
    invoke-virtual {v11, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1450
    .line 1451
    .line 1452
    iget v3, v1, La/spp0;->p:I

    .line 1453
    .line 1454
    invoke-virtual {v11, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1455
    .line 1456
    .line 1457
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1458
    .line 1459
    iget-object v3, v12, La/lsx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1460
    .line 1461
    iget-object v4, v1, La/spp0;->i:Ljava/lang/String;

    .line 1462
    .line 1463
    const/16 v5, 0xb

    .line 1464
    .line 1465
    const/4 v6, 0x0

    .line 1466
    invoke-static {v3, v4, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1467
    .line 1468
    .line 1469
    iget-object v3, v12, La/lsx;->j:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1470
    .line 1471
    iget-object v4, v1, La/spp0;->j:Ljava/lang/String;

    .line 1472
    .line 1473
    invoke-static {v3, v4, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1474
    .line 1475
    .line 1476
    iget-object v3, v12, La/lsx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1477
    .line 1478
    iget-object v4, v1, La/spp0;->k:Ljava/lang/String;

    .line 1479
    .line 1480
    invoke-static {v3, v4, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1481
    .line 1482
    .line 1483
    iget-object v3, v12, La/lsx;->k:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1484
    .line 1485
    iget-object v1, v1, La/spp0;->l:Ljava/lang/String;

    .line 1486
    .line 1487
    invoke-static {v3, v1, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1488
    .line 1489
    .line 1490
    :goto_1c
    iget v1, v0, La/yca;->d:I

    .line 1491
    .line 1492
    iget-object v3, v12, La/lsx;->q:Landroid/widget/TextView;

    .line 1493
    .line 1494
    invoke-static {v1, v3}, La/nia0;->c0(ILandroid/widget/TextView;)V

    .line 1495
    .line 1496
    .line 1497
    iget v1, v0, La/yca;->e:I

    .line 1498
    .line 1499
    iget-object v3, v12, La/lsx;->v:Landroid/widget/TextView;

    .line 1500
    .line 1501
    invoke-static {v1, v3}, La/nia0;->c0(ILandroid/widget/TextView;)V

    .line 1502
    .line 1503
    .line 1504
    invoke-static/range {v16 .. v16}, La/jwb;->A(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 1505
    .line 1506
    .line 1507
    iget-object v1, v0, La/yca;->g:La/ank0;

    .line 1508
    .line 1509
    invoke-virtual {v1, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v1

    .line 1513
    move-object/from16 v2, v16

    .line 1514
    .line 1515
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1516
    .line 1517
    .line 1518
    iget-object v1, v12, La/lsx;->w:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 1519
    .line 1520
    iget-object v0, v0, La/yca;->i:La/hg30;

    .line 1521
    .line 1522
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 1523
    .line 1524
    .line 1525
    iget-object v0, v12, La/lsx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1526
    .line 1527
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v1

    .line 1531
    check-cast v1, La/yca;

    .line 1532
    .line 1533
    iget-boolean v1, v1, La/yca;->l:Z

    .line 1534
    .line 1535
    if-eqz v1, :cond_2a

    .line 1536
    .line 1537
    const/4 v6, 0x2

    .line 1538
    goto :goto_1d

    .line 1539
    :cond_2a
    const/4 v6, 0x0

    .line 1540
    :goto_1d
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1541
    .line 1542
    .line 1543
    goto/16 :goto_22

    .line 1544
    .line 1545
    :cond_2b
    invoke-static {}, La/t9f;->b()V

    .line 1546
    .line 1547
    .line 1548
    :goto_1e
    const/4 v11, 0x0

    .line 1549
    goto/16 :goto_23

    .line 1550
    .line 1551
    :cond_2c
    new-instance v1, Ljava/util/ArrayList;

    .line 1552
    .line 1553
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1554
    .line 1555
    .line 1556
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v0

    .line 1560
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1561
    .line 1562
    .line 1563
    move-result v2

    .line 1564
    if-eqz v2, :cond_2d

    .line 1565
    .line 1566
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v2

    .line 1570
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1571
    .line 1572
    .line 1573
    check-cast v2, Ljava/util/Collection;

    .line 1574
    .line 1575
    check-cast v2, Ljava/lang/Iterable;

    .line 1576
    .line 1577
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1578
    .line 1579
    .line 1580
    goto :goto_1f

    .line 1581
    :cond_2d
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v0

    .line 1585
    :cond_2e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1586
    .line 1587
    .line 1588
    move-result v1

    .line 1589
    if-eqz v1, :cond_43

    .line 1590
    .line 1591
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    check-cast v1, Ljava/util/List;

    .line 1596
    .line 1597
    new-instance v2, Ljava/util/ArrayList;

    .line 1598
    .line 1599
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1600
    .line 1601
    .line 1602
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v1

    .line 1606
    :cond_2f
    :goto_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1607
    .line 1608
    .line 1609
    move-result v3

    .line 1610
    if-eqz v3, :cond_30

    .line 1611
    .line 1612
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v3

    .line 1616
    instance-of v4, v3, La/oes;

    .line 1617
    .line 1618
    if-eqz v4, :cond_2f

    .line 1619
    .line 1620
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1621
    .line 1622
    .line 1623
    goto :goto_20

    .line 1624
    :cond_30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v1

    .line 1628
    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1629
    .line 1630
    .line 1631
    move-result v2

    .line 1632
    if-eqz v2, :cond_2e

    .line 1633
    .line 1634
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v2

    .line 1638
    check-cast v2, La/oes;

    .line 1639
    .line 1640
    iget-object v3, v9, La/cp;->w:Landroid/content/Context;

    .line 1641
    .line 1642
    iget-object v4, v9, La/cp;->u:La/yfu0;

    .line 1643
    .line 1644
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1645
    .line 1646
    .line 1647
    instance-of v5, v2, La/xds;

    .line 1648
    .line 1649
    if-eqz v5, :cond_31

    .line 1650
    .line 1651
    check-cast v4, La/lsx;

    .line 1652
    .line 1653
    iget-object v4, v4, La/lsx;->s:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1654
    .line 1655
    check-cast v2, La/xds;

    .line 1656
    .line 1657
    iget-object v2, v2, La/xds;->a:La/ank0;

    .line 1658
    .line 1659
    invoke-virtual {v2, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v2

    .line 1663
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1664
    .line 1665
    .line 1666
    goto :goto_21

    .line 1667
    :cond_31
    instance-of v5, v2, La/yds;

    .line 1668
    .line 1669
    if-eqz v5, :cond_33

    .line 1670
    .line 1671
    check-cast v4, La/lsx;

    .line 1672
    .line 1673
    iget-object v5, v4, La/lsx;->t:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1674
    .line 1675
    invoke-virtual {v5}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v5

    .line 1679
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v5

    .line 1683
    check-cast v2, La/yds;

    .line 1684
    .line 1685
    iget-object v2, v2, La/yds;->a:La/ank0;

    .line 1686
    .line 1687
    invoke-virtual {v2}, La/ank0;->a()Ljava/lang/String;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v6

    .line 1691
    new-instance v7, Lkotlin/text/Regex;

    .line 1692
    .line 1693
    const-string v8, "\\d+"

    .line 1694
    .line 1695
    invoke-direct {v7, v8}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 1696
    .line 1697
    .line 1698
    invoke-static {v7, v5}, Lkotlin/text/Regex;->d(Lkotlin/text/Regex;Ljava/lang/CharSequence;)La/tjt;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v5

    .line 1702
    new-instance v8, La/d69;

    .line 1703
    .line 1704
    const/16 v10, 0xb

    .line 1705
    .line 1706
    invoke-direct {v8, v10}, La/d69;-><init>(B)V

    .line 1707
    .line 1708
    .line 1709
    invoke-static {v5, v8}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v5

    .line 1713
    invoke-static {v5}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v5

    .line 1717
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->C0(Ljava/util/List;)I

    .line 1718
    .line 1719
    .line 1720
    move-result v5

    .line 1721
    invoke-static {v7, v6}, Lkotlin/text/Regex;->d(Lkotlin/text/Regex;Ljava/lang/CharSequence;)La/tjt;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v6

    .line 1725
    new-instance v7, La/d69;

    .line 1726
    .line 1727
    const/16 v8, 0xc

    .line 1728
    .line 1729
    invoke-direct {v7, v8}, La/d69;-><init>(B)V

    .line 1730
    .line 1731
    .line 1732
    invoke-static {v6, v7}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v6

    .line 1736
    invoke-static {v6}, La/pgi0;->t(Lkotlin/sequences/Sequence;)Ljava/util/List;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v6

    .line 1740
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->C0(Ljava/util/List;)I

    .line 1741
    .line 1742
    .line 1743
    move-result v6

    .line 1744
    iget-object v4, v4, La/lsx;->t:Landroidx/appcompat/widget/AppCompatTextView;

    .line 1745
    .line 1746
    if-ge v5, v6, :cond_32

    .line 1747
    .line 1748
    invoke-virtual {v2, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v2

    .line 1752
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1753
    .line 1754
    .line 1755
    goto :goto_21

    .line 1756
    :cond_32
    invoke-virtual {v2}, La/ank0;->a()Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v2

    .line 1760
    const-string v3, ", "

    .line 1761
    .line 1762
    const-string v5, ""

    .line 1763
    .line 1764
    const/4 v6, 0x0

    .line 1765
    invoke-static {v2, v3, v5, v6}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v2

    .line 1769
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1770
    .line 1771
    .line 1772
    goto/16 :goto_21

    .line 1773
    .line 1774
    :cond_33
    instance-of v3, v2, La/nes;

    .line 1775
    .line 1776
    if-eqz v3, :cond_34

    .line 1777
    .line 1778
    check-cast v4, La/lsx;

    .line 1779
    .line 1780
    iget-object v3, v4, La/lsx;->w:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 1781
    .line 1782
    check-cast v2, La/nes;

    .line 1783
    .line 1784
    iget-object v2, v2, La/nes;->a:La/hg30;

    .line 1785
    .line 1786
    invoke-virtual {v3, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 1787
    .line 1788
    .line 1789
    goto/16 :goto_21

    .line 1790
    .line 1791
    :cond_34
    instance-of v3, v2, La/ces;

    .line 1792
    .line 1793
    if-eqz v3, :cond_35

    .line 1794
    .line 1795
    check-cast v2, La/ces;

    .line 1796
    .line 1797
    iget v2, v2, La/ces;->a:I

    .line 1798
    .line 1799
    check-cast v4, La/lsx;

    .line 1800
    .line 1801
    iget-object v3, v4, La/lsx;->q:Landroid/widget/TextView;

    .line 1802
    .line 1803
    invoke-static {v2, v3}, La/nia0;->c0(ILandroid/widget/TextView;)V

    .line 1804
    .line 1805
    .line 1806
    goto/16 :goto_21

    .line 1807
    .line 1808
    :cond_35
    instance-of v3, v2, La/les;

    .line 1809
    .line 1810
    if-eqz v3, :cond_36

    .line 1811
    .line 1812
    check-cast v2, La/les;

    .line 1813
    .line 1814
    iget v2, v2, La/les;->a:I

    .line 1815
    .line 1816
    check-cast v4, La/lsx;

    .line 1817
    .line 1818
    iget-object v3, v4, La/lsx;->v:Landroid/widget/TextView;

    .line 1819
    .line 1820
    invoke-static {v2, v3}, La/nia0;->c0(ILandroid/widget/TextView;)V

    .line 1821
    .line 1822
    .line 1823
    goto/16 :goto_21

    .line 1824
    .line 1825
    :cond_36
    instance-of v3, v2, La/zds;

    .line 1826
    .line 1827
    if-eqz v3, :cond_37

    .line 1828
    .line 1829
    check-cast v4, La/lsx;

    .line 1830
    .line 1831
    iget-object v3, v4, La/lsx;->d:Landroid/widget/ImageView;

    .line 1832
    .line 1833
    check-cast v2, La/zds;

    .line 1834
    .line 1835
    iget v2, v2, La/zds;->a:I

    .line 1836
    .line 1837
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1838
    .line 1839
    .line 1840
    goto/16 :goto_21

    .line 1841
    .line 1842
    :cond_37
    instance-of v3, v2, La/ies;

    .line 1843
    .line 1844
    if-eqz v3, :cond_38

    .line 1845
    .line 1846
    check-cast v4, La/lsx;

    .line 1847
    .line 1848
    iget-object v3, v4, La/lsx;->l:Landroid/widget/ImageView;

    .line 1849
    .line 1850
    check-cast v2, La/ies;

    .line 1851
    .line 1852
    iget v2, v2, La/ies;->a:I

    .line 1853
    .line 1854
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1855
    .line 1856
    .line 1857
    goto/16 :goto_21

    .line 1858
    .line 1859
    :cond_38
    instance-of v3, v2, La/ees;

    .line 1860
    .line 1861
    if-eqz v3, :cond_39

    .line 1862
    .line 1863
    check-cast v4, La/lsx;

    .line 1864
    .line 1865
    iget-object v3, v4, La/lsx;->f:Landroid/widget/ImageView;

    .line 1866
    .line 1867
    check-cast v2, La/ees;

    .line 1868
    .line 1869
    iget v2, v2, La/ees;->a:I

    .line 1870
    .line 1871
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1872
    .line 1873
    .line 1874
    goto/16 :goto_21

    .line 1875
    .line 1876
    :cond_39
    instance-of v3, v2, La/fes;

    .line 1877
    .line 1878
    if-eqz v3, :cond_3a

    .line 1879
    .line 1880
    check-cast v4, La/lsx;

    .line 1881
    .line 1882
    iget-object v3, v4, La/lsx;->h:Landroid/widget/ImageView;

    .line 1883
    .line 1884
    check-cast v2, La/fes;

    .line 1885
    .line 1886
    iget v2, v2, La/fes;->a:I

    .line 1887
    .line 1888
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1889
    .line 1890
    .line 1891
    goto/16 :goto_21

    .line 1892
    .line 1893
    :cond_3a
    instance-of v3, v2, La/ges;

    .line 1894
    .line 1895
    if-eqz v3, :cond_3b

    .line 1896
    .line 1897
    check-cast v4, La/lsx;

    .line 1898
    .line 1899
    iget-object v3, v4, La/lsx;->g:Landroid/widget/ImageView;

    .line 1900
    .line 1901
    check-cast v2, La/ges;

    .line 1902
    .line 1903
    iget v2, v2, La/ges;->a:I

    .line 1904
    .line 1905
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1906
    .line 1907
    .line 1908
    goto/16 :goto_21

    .line 1909
    .line 1910
    :cond_3b
    instance-of v3, v2, La/hes;

    .line 1911
    .line 1912
    if-eqz v3, :cond_3c

    .line 1913
    .line 1914
    check-cast v4, La/lsx;

    .line 1915
    .line 1916
    iget-object v3, v4, La/lsx;->i:Landroid/widget/ImageView;

    .line 1917
    .line 1918
    check-cast v2, La/hes;

    .line 1919
    .line 1920
    iget v2, v2, La/hes;->a:I

    .line 1921
    .line 1922
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1923
    .line 1924
    .line 1925
    goto/16 :goto_21

    .line 1926
    .line 1927
    :cond_3c
    instance-of v3, v2, La/aes;

    .line 1928
    .line 1929
    if-eqz v3, :cond_3d

    .line 1930
    .line 1931
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1932
    .line 1933
    check-cast v4, La/lsx;

    .line 1934
    .line 1935
    iget-object v3, v4, La/lsx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1936
    .line 1937
    check-cast v2, La/aes;

    .line 1938
    .line 1939
    iget-object v2, v2, La/aes;->a:Ljava/lang/String;

    .line 1940
    .line 1941
    const/16 v5, 0xb

    .line 1942
    .line 1943
    const/4 v6, 0x0

    .line 1944
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1945
    .line 1946
    .line 1947
    goto/16 :goto_21

    .line 1948
    .line 1949
    :cond_3d
    const/16 v5, 0xb

    .line 1950
    .line 1951
    const/4 v6, 0x0

    .line 1952
    instance-of v3, v2, La/des;

    .line 1953
    .line 1954
    if-eqz v3, :cond_3e

    .line 1955
    .line 1956
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1957
    .line 1958
    check-cast v4, La/lsx;

    .line 1959
    .line 1960
    iget-object v3, v4, La/lsx;->j:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1961
    .line 1962
    check-cast v2, La/des;

    .line 1963
    .line 1964
    iget-object v2, v2, La/des;->a:Ljava/lang/String;

    .line 1965
    .line 1966
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1967
    .line 1968
    .line 1969
    goto/16 :goto_21

    .line 1970
    .line 1971
    :cond_3e
    instance-of v3, v2, La/jes;

    .line 1972
    .line 1973
    if-eqz v3, :cond_3f

    .line 1974
    .line 1975
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1976
    .line 1977
    check-cast v4, La/lsx;

    .line 1978
    .line 1979
    iget-object v3, v4, La/lsx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1980
    .line 1981
    check-cast v2, La/jes;

    .line 1982
    .line 1983
    iget-object v2, v2, La/jes;->a:Ljava/lang/String;

    .line 1984
    .line 1985
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1986
    .line 1987
    .line 1988
    goto/16 :goto_21

    .line 1989
    .line 1990
    :cond_3f
    instance-of v3, v2, La/mes;

    .line 1991
    .line 1992
    if-eqz v3, :cond_40

    .line 1993
    .line 1994
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 1995
    .line 1996
    check-cast v4, La/lsx;

    .line 1997
    .line 1998
    iget-object v3, v4, La/lsx;->k:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 1999
    .line 2000
    check-cast v2, La/mes;

    .line 2001
    .line 2002
    iget-object v2, v2, La/mes;->a:Ljava/lang/String;

    .line 2003
    .line 2004
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2005
    .line 2006
    .line 2007
    goto/16 :goto_21

    .line 2008
    .line 2009
    :cond_40
    instance-of v3, v2, La/bes;

    .line 2010
    .line 2011
    if-eqz v3, :cond_41

    .line 2012
    .line 2013
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 2014
    .line 2015
    check-cast v4, La/lsx;

    .line 2016
    .line 2017
    iget-object v3, v4, La/lsx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2018
    .line 2019
    check-cast v2, La/bes;

    .line 2020
    .line 2021
    iget-object v2, v2, La/bes;->a:Ljava/lang/String;

    .line 2022
    .line 2023
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2024
    .line 2025
    .line 2026
    goto/16 :goto_21

    .line 2027
    .line 2028
    :cond_41
    instance-of v3, v2, La/kes;

    .line 2029
    .line 2030
    if-eqz v3, :cond_42

    .line 2031
    .line 2032
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 2033
    .line 2034
    check-cast v4, La/lsx;

    .line 2035
    .line 2036
    iget-object v3, v4, La/lsx;->m:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2037
    .line 2038
    check-cast v2, La/kes;

    .line 2039
    .line 2040
    iget-object v2, v2, La/kes;->a:Ljava/lang/String;

    .line 2041
    .line 2042
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2043
    .line 2044
    .line 2045
    goto/16 :goto_21

    .line 2046
    .line 2047
    :cond_42
    invoke-static {}, La/t9f;->b()V

    .line 2048
    .line 2049
    .line 2050
    goto/16 :goto_1e

    .line 2051
    .line 2052
    :cond_43
    :goto_22
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2053
    .line 2054
    :goto_23
    return-object v11

    .line 2055
    :pswitch_19
    move-object/from16 v18, v10

    .line 2056
    .line 2057
    move-object/from16 v0, p1

    .line 2058
    .line 2059
    check-cast v0, Ljava/util/List;

    .line 2060
    .line 2061
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2062
    .line 2063
    .line 2064
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2065
    .line 2066
    .line 2067
    move-result v1

    .line 2068
    if-eqz v1, :cond_4f

    .line 2069
    .line 2070
    invoke-virtual/range {v18 .. v18}, La/cp;->u()Ljava/lang/Object;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v0

    .line 2074
    check-cast v0, La/uca;

    .line 2075
    .line 2076
    iget-object v1, v0, La/uca;->d:La/ank0;

    .line 2077
    .line 2078
    move-object/from16 v3, v18

    .line 2079
    .line 2080
    iget-object v4, v3, La/cp;->w:Landroid/content/Context;

    .line 2081
    .line 2082
    invoke-virtual {v1, v4}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v1

    .line 2086
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 2087
    .line 2088
    .line 2089
    move-result v4

    .line 2090
    iget-object v5, v3, La/cp;->u:La/yfu0;

    .line 2091
    .line 2092
    if-lez v4, :cond_44

    .line 2093
    .line 2094
    move-object v4, v5

    .line 2095
    check-cast v4, La/lsx;

    .line 2096
    .line 2097
    iget-object v6, v4, La/lsx;->r:Landroid/widget/TextView;

    .line 2098
    .line 2099
    const/4 v7, 0x0

    .line 2100
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2101
    .line 2102
    .line 2103
    iget-object v4, v4, La/lsx;->r:Landroid/widget/TextView;

    .line 2104
    .line 2105
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2106
    .line 2107
    .line 2108
    const/16 v4, 0x8

    .line 2109
    .line 2110
    goto :goto_24

    .line 2111
    :cond_44
    move-object v1, v5

    .line 2112
    check-cast v1, La/lsx;

    .line 2113
    .line 2114
    iget-object v1, v1, La/lsx;->r:Landroid/widget/TextView;

    .line 2115
    .line 2116
    const/16 v4, 0x8

    .line 2117
    .line 2118
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2119
    .line 2120
    .line 2121
    :goto_24
    iget-object v1, v0, La/uca;->c:La/ohm0;

    .line 2122
    .line 2123
    instance-of v6, v1, La/spp0;

    .line 2124
    .line 2125
    if-eqz v6, :cond_49

    .line 2126
    .line 2127
    check-cast v1, La/spp0;

    .line 2128
    .line 2129
    move-object v6, v5

    .line 2130
    check-cast v6, La/lsx;

    .line 2131
    .line 2132
    iget-object v7, v6, La/lsx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2133
    .line 2134
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2135
    .line 2136
    .line 2137
    iget-object v7, v6, La/lsx;->m:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2138
    .line 2139
    iget-object v8, v6, La/lsx;->i:Landroid/widget/ImageView;

    .line 2140
    .line 2141
    iget-object v9, v6, La/lsx;->g:Landroid/widget/ImageView;

    .line 2142
    .line 2143
    iget-object v10, v6, La/lsx;->h:Landroid/widget/ImageView;

    .line 2144
    .line 2145
    iget-object v11, v6, La/lsx;->f:Landroid/widget/ImageView;

    .line 2146
    .line 2147
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2148
    .line 2149
    .line 2150
    iget-object v7, v6, La/lsx;->d:Landroid/widget/ImageView;

    .line 2151
    .line 2152
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2153
    .line 2154
    .line 2155
    iget-object v7, v6, La/lsx;->l:Landroid/widget/ImageView;

    .line 2156
    .line 2157
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2158
    .line 2159
    .line 2160
    iget-object v4, v6, La/lsx;->n:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2161
    .line 2162
    const/4 v7, 0x0

    .line 2163
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2164
    .line 2165
    .line 2166
    iget-object v4, v6, La/lsx;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2167
    .line 2168
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2169
    .line 2170
    .line 2171
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2172
    .line 2173
    .line 2174
    move-result-object v4

    .line 2175
    check-cast v4, La/uca;

    .line 2176
    .line 2177
    iget-boolean v4, v4, La/uca;->h:Z

    .line 2178
    .line 2179
    if-nez v4, :cond_45

    .line 2180
    .line 2181
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2182
    .line 2183
    .line 2184
    move-result-object v4

    .line 2185
    check-cast v4, La/uca;

    .line 2186
    .line 2187
    iget-boolean v4, v4, La/uca;->f:Z

    .line 2188
    .line 2189
    if-nez v4, :cond_45

    .line 2190
    .line 2191
    const/4 v4, 0x0

    .line 2192
    goto :goto_25

    .line 2193
    :cond_45
    const/16 v4, 0x8

    .line 2194
    .line 2195
    :goto_25
    invoke-virtual {v11, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v4

    .line 2202
    check-cast v4, La/uca;

    .line 2203
    .line 2204
    iget-boolean v4, v4, La/uca;->h:Z

    .line 2205
    .line 2206
    if-nez v4, :cond_46

    .line 2207
    .line 2208
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v4

    .line 2212
    check-cast v4, La/uca;

    .line 2213
    .line 2214
    iget-boolean v4, v4, La/uca;->f:Z

    .line 2215
    .line 2216
    if-nez v4, :cond_46

    .line 2217
    .line 2218
    const/4 v4, 0x0

    .line 2219
    goto :goto_26

    .line 2220
    :cond_46
    const/16 v4, 0x8

    .line 2221
    .line 2222
    :goto_26
    invoke-virtual {v10, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2223
    .line 2224
    .line 2225
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v4

    .line 2229
    check-cast v4, La/uca;

    .line 2230
    .line 2231
    iget-boolean v4, v4, La/uca;->h:Z

    .line 2232
    .line 2233
    if-nez v4, :cond_47

    .line 2234
    .line 2235
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v4

    .line 2239
    check-cast v4, La/uca;

    .line 2240
    .line 2241
    iget-boolean v4, v4, La/uca;->f:Z

    .line 2242
    .line 2243
    if-nez v4, :cond_47

    .line 2244
    .line 2245
    const/4 v4, 0x0

    .line 2246
    goto :goto_27

    .line 2247
    :cond_47
    const/16 v4, 0x8

    .line 2248
    .line 2249
    :goto_27
    invoke-virtual {v9, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2250
    .line 2251
    .line 2252
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v4

    .line 2256
    check-cast v4, La/uca;

    .line 2257
    .line 2258
    iget-boolean v4, v4, La/uca;->h:Z

    .line 2259
    .line 2260
    if-nez v4, :cond_48

    .line 2261
    .line 2262
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v4

    .line 2266
    check-cast v4, La/uca;

    .line 2267
    .line 2268
    iget-boolean v4, v4, La/uca;->f:Z

    .line 2269
    .line 2270
    if-nez v4, :cond_48

    .line 2271
    .line 2272
    const/4 v4, 0x0

    .line 2273
    goto :goto_28

    .line 2274
    :cond_48
    const/16 v4, 0x8

    .line 2275
    .line 2276
    :goto_28
    invoke-virtual {v8, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2277
    .line 2278
    .line 2279
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 2280
    .line 2281
    iget-object v4, v6, La/lsx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2282
    .line 2283
    iget-object v7, v1, La/spp0;->i:Ljava/lang/String;

    .line 2284
    .line 2285
    const/16 v12, 0xb

    .line 2286
    .line 2287
    const/4 v13, 0x0

    .line 2288
    invoke-static {v4, v7, v13, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2289
    .line 2290
    .line 2291
    iget-object v4, v6, La/lsx;->j:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2292
    .line 2293
    iget-object v7, v1, La/spp0;->j:Ljava/lang/String;

    .line 2294
    .line 2295
    invoke-static {v4, v7, v13, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2296
    .line 2297
    .line 2298
    iget-object v4, v6, La/lsx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2299
    .line 2300
    iget-object v7, v1, La/spp0;->k:Ljava/lang/String;

    .line 2301
    .line 2302
    invoke-static {v4, v7, v13, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2303
    .line 2304
    .line 2305
    iget-object v4, v6, La/lsx;->k:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2306
    .line 2307
    iget-object v7, v1, La/spp0;->l:Ljava/lang/String;

    .line 2308
    .line 2309
    invoke-static {v4, v7, v13, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2310
    .line 2311
    .line 2312
    iget v4, v1, La/spp0;->m:I

    .line 2313
    .line 2314
    invoke-virtual {v11, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2315
    .line 2316
    .line 2317
    iget v4, v1, La/spp0;->n:I

    .line 2318
    .line 2319
    invoke-virtual {v10, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2320
    .line 2321
    .line 2322
    iget v4, v1, La/spp0;->o:I

    .line 2323
    .line 2324
    invoke-virtual {v9, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2325
    .line 2326
    .line 2327
    iget v4, v1, La/spp0;->p:I

    .line 2328
    .line 2329
    invoke-virtual {v8, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2330
    .line 2331
    .line 2332
    iget-object v4, v6, La/lsx;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2333
    .line 2334
    iget-object v7, v1, La/spp0;->q:Ljava/lang/String;

    .line 2335
    .line 2336
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2337
    .line 2338
    .line 2339
    iget-object v4, v6, La/lsx;->u:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2340
    .line 2341
    iget-object v1, v1, La/spp0;->r:Ljava/lang/String;

    .line 2342
    .line 2343
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2344
    .line 2345
    .line 2346
    goto/16 :goto_2c

    .line 2347
    .line 2348
    :cond_49
    instance-of v4, v1, La/tpp0;

    .line 2349
    .line 2350
    if-eqz v4, :cond_4e

    .line 2351
    .line 2352
    check-cast v1, La/tpp0;

    .line 2353
    .line 2354
    move-object v4, v5

    .line 2355
    check-cast v4, La/lsx;

    .line 2356
    .line 2357
    iget-object v6, v4, La/lsx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2358
    .line 2359
    const/4 v7, 0x0

    .line 2360
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2361
    .line 2362
    .line 2363
    iget-object v6, v4, La/lsx;->m:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2364
    .line 2365
    iget-object v8, v4, La/lsx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2366
    .line 2367
    iget-object v9, v4, La/lsx;->l:Landroid/widget/ImageView;

    .line 2368
    .line 2369
    iget-object v10, v4, La/lsx;->d:Landroid/widget/ImageView;

    .line 2370
    .line 2371
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2372
    .line 2373
    .line 2374
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v7

    .line 2378
    check-cast v7, La/uca;

    .line 2379
    .line 2380
    iget-boolean v7, v7, La/uca;->h:Z

    .line 2381
    .line 2382
    if-nez v7, :cond_4a

    .line 2383
    .line 2384
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v7

    .line 2388
    check-cast v7, La/uca;

    .line 2389
    .line 2390
    iget-boolean v7, v7, La/uca;->f:Z

    .line 2391
    .line 2392
    if-nez v7, :cond_4a

    .line 2393
    .line 2394
    const/4 v7, 0x0

    .line 2395
    goto :goto_29

    .line 2396
    :cond_4a
    const/16 v7, 0x8

    .line 2397
    .line 2398
    :goto_29
    invoke-virtual {v10, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2399
    .line 2400
    .line 2401
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v7

    .line 2405
    check-cast v7, La/uca;

    .line 2406
    .line 2407
    iget-boolean v7, v7, La/uca;->h:Z

    .line 2408
    .line 2409
    if-nez v7, :cond_4b

    .line 2410
    .line 2411
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v7

    .line 2415
    check-cast v7, La/uca;

    .line 2416
    .line 2417
    iget-boolean v7, v7, La/uca;->f:Z

    .line 2418
    .line 2419
    if-nez v7, :cond_4b

    .line 2420
    .line 2421
    const/4 v7, 0x0

    .line 2422
    goto :goto_2a

    .line 2423
    :cond_4b
    const/16 v7, 0x8

    .line 2424
    .line 2425
    :goto_2a
    invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2426
    .line 2427
    .line 2428
    iget-object v7, v4, La/lsx;->n:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2429
    .line 2430
    const/16 v11, 0x8

    .line 2431
    .line 2432
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2433
    .line 2434
    .line 2435
    iget-object v7, v4, La/lsx;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2436
    .line 2437
    invoke-virtual {v7, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2438
    .line 2439
    .line 2440
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2441
    .line 2442
    .line 2443
    move-result-object v7

    .line 2444
    check-cast v7, La/uca;

    .line 2445
    .line 2446
    iget-boolean v7, v7, La/uca;->f:Z

    .line 2447
    .line 2448
    if-eqz v7, :cond_4c

    .line 2449
    .line 2450
    const v7, 0x7f080843

    .line 2451
    .line 2452
    .line 2453
    invoke-virtual {v8, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 2454
    .line 2455
    .line 2456
    const v7, 0x7f080842

    .line 2457
    .line 2458
    .line 2459
    invoke-virtual {v6, v7}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 2460
    .line 2461
    .line 2462
    goto :goto_2b

    .line 2463
    :cond_4c
    sget-object v7, La/u0d;->a:Ljava/util/List;

    .line 2464
    .line 2465
    iget-object v7, v1, La/tpp0;->e:Ljava/lang/String;

    .line 2466
    .line 2467
    const/16 v12, 0xb

    .line 2468
    .line 2469
    const/4 v13, 0x0

    .line 2470
    invoke-static {v8, v7, v13, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2471
    .line 2472
    .line 2473
    iget-object v7, v1, La/tpp0;->f:Ljava/lang/String;

    .line 2474
    .line 2475
    invoke-static {v6, v7, v13, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2476
    .line 2477
    .line 2478
    :goto_2b
    iget v6, v1, La/tpp0;->g:I

    .line 2479
    .line 2480
    invoke-virtual {v10, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2481
    .line 2482
    .line 2483
    iget v6, v1, La/tpp0;->h:I

    .line 2484
    .line 2485
    invoke-virtual {v9, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2486
    .line 2487
    .line 2488
    iget-object v6, v4, La/lsx;->p:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2489
    .line 2490
    iget-object v7, v1, La/tpp0;->i:Ljava/lang/String;

    .line 2491
    .line 2492
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2493
    .line 2494
    .line 2495
    iget-object v4, v4, La/lsx;->u:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2496
    .line 2497
    iget-object v1, v1, La/tpp0;->j:Ljava/lang/String;

    .line 2498
    .line 2499
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2500
    .line 2501
    .line 2502
    :goto_2c
    check-cast v5, La/lsx;

    .line 2503
    .line 2504
    iget-object v1, v5, La/lsx;->s:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2505
    .line 2506
    iget-object v4, v5, La/lsx;->t:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2507
    .line 2508
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 2509
    .line 2510
    .line 2511
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 2512
    .line 2513
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 2514
    .line 2515
    .line 2516
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2517
    .line 2518
    .line 2519
    move-result-object v2

    .line 2520
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2521
    .line 2522
    .line 2523
    check-cast v2, La/a3e;

    .line 2524
    .line 2525
    const/4 v6, -0x2

    .line 2526
    iput v6, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 2527
    .line 2528
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2529
    .line 2530
    .line 2531
    iget-object v1, v5, La/lsx;->s:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2532
    .line 2533
    iget-object v2, v0, La/uca;->e:Ljava/lang/String;

    .line 2534
    .line 2535
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2536
    .line 2537
    .line 2538
    invoke-static {v4}, La/jwb;->y(Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 2539
    .line 2540
    .line 2541
    iget-object v1, v0, La/uca;->b:Ljava/lang/String;

    .line 2542
    .line 2543
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2544
    .line 2545
    .line 2546
    iget-object v1, v5, La/lsx;->w:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 2547
    .line 2548
    iget-object v0, v0, La/uca;->g:La/hg30;

    .line 2549
    .line 2550
    invoke-virtual {v1, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 2551
    .line 2552
    .line 2553
    iget-object v0, v5, La/lsx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2554
    .line 2555
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2556
    .line 2557
    .line 2558
    move-result-object v1

    .line 2559
    check-cast v1, La/uca;

    .line 2560
    .line 2561
    iget-boolean v1, v1, La/uca;->j:Z

    .line 2562
    .line 2563
    if-eqz v1, :cond_4d

    .line 2564
    .line 2565
    const/4 v6, 0x2

    .line 2566
    goto :goto_2d

    .line 2567
    :cond_4d
    const/4 v6, 0x0

    .line 2568
    :goto_2d
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutDirection(I)V

    .line 2569
    .line 2570
    .line 2571
    goto/16 :goto_33

    .line 2572
    .line 2573
    :cond_4e
    invoke-static {}, La/t9f;->b()V

    .line 2574
    .line 2575
    .line 2576
    :goto_2e
    const/4 v11, 0x0

    .line 2577
    goto/16 :goto_34

    .line 2578
    .line 2579
    :cond_4f
    new-instance v1, Ljava/util/ArrayList;

    .line 2580
    .line 2581
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2582
    .line 2583
    .line 2584
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v0

    .line 2588
    :goto_2f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2589
    .line 2590
    .line 2591
    move-result v2

    .line 2592
    if-eqz v2, :cond_50

    .line 2593
    .line 2594
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2595
    .line 2596
    .line 2597
    move-result-object v2

    .line 2598
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2599
    .line 2600
    .line 2601
    check-cast v2, Ljava/util/Collection;

    .line 2602
    .line 2603
    check-cast v2, Ljava/lang/Iterable;

    .line 2604
    .line 2605
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 2606
    .line 2607
    .line 2608
    goto :goto_2f

    .line 2609
    :cond_50
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2610
    .line 2611
    .line 2612
    move-result-object v0

    .line 2613
    :cond_51
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2614
    .line 2615
    .line 2616
    move-result v1

    .line 2617
    if-eqz v1, :cond_62

    .line 2618
    .line 2619
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2620
    .line 2621
    .line 2622
    move-result-object v1

    .line 2623
    check-cast v1, Ljava/util/List;

    .line 2624
    .line 2625
    new-instance v2, Ljava/util/ArrayList;

    .line 2626
    .line 2627
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2628
    .line 2629
    .line 2630
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2631
    .line 2632
    .line 2633
    move-result-object v1

    .line 2634
    :cond_52
    :goto_30
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2635
    .line 2636
    .line 2637
    move-result v3

    .line 2638
    if-eqz v3, :cond_53

    .line 2639
    .line 2640
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2641
    .line 2642
    .line 2643
    move-result-object v3

    .line 2644
    instance-of v4, v3, La/wds;

    .line 2645
    .line 2646
    if-eqz v4, :cond_52

    .line 2647
    .line 2648
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2649
    .line 2650
    .line 2651
    goto :goto_30

    .line 2652
    :cond_53
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v1

    .line 2656
    :goto_31
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2657
    .line 2658
    .line 2659
    move-result v2

    .line 2660
    if-eqz v2, :cond_51

    .line 2661
    .line 2662
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2663
    .line 2664
    .line 2665
    move-result-object v2

    .line 2666
    check-cast v2, La/wds;

    .line 2667
    .line 2668
    iget-object v3, v9, La/cp;->u:La/yfu0;

    .line 2669
    .line 2670
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2671
    .line 2672
    .line 2673
    instance-of v4, v2, La/vds;

    .line 2674
    .line 2675
    if-eqz v4, :cond_54

    .line 2676
    .line 2677
    check-cast v3, La/lsx;

    .line 2678
    .line 2679
    iget-object v3, v3, La/lsx;->w:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;

    .line 2680
    .line 2681
    check-cast v2, La/vds;

    .line 2682
    .line 2683
    iget-object v2, v2, La/vds;->a:La/hg30;

    .line 2684
    .line 2685
    invoke-virtual {v3, v2}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/MatchTimerView;->u(La/hg30;)V

    .line 2686
    .line 2687
    .line 2688
    :goto_32
    const/16 v5, 0xb

    .line 2689
    .line 2690
    goto :goto_31

    .line 2691
    :cond_54
    instance-of v4, v2, La/jds;

    .line 2692
    .line 2693
    if-eqz v4, :cond_55

    .line 2694
    .line 2695
    check-cast v3, La/lsx;

    .line 2696
    .line 2697
    iget-object v3, v3, La/lsx;->d:Landroid/widget/ImageView;

    .line 2698
    .line 2699
    check-cast v2, La/jds;

    .line 2700
    .line 2701
    iget v2, v2, La/jds;->a:I

    .line 2702
    .line 2703
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2704
    .line 2705
    .line 2706
    goto :goto_32

    .line 2707
    :cond_55
    instance-of v4, v2, La/rds;

    .line 2708
    .line 2709
    if-eqz v4, :cond_56

    .line 2710
    .line 2711
    check-cast v3, La/lsx;

    .line 2712
    .line 2713
    iget-object v3, v3, La/lsx;->l:Landroid/widget/ImageView;

    .line 2714
    .line 2715
    check-cast v2, La/rds;

    .line 2716
    .line 2717
    iget v2, v2, La/rds;->a:I

    .line 2718
    .line 2719
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2720
    .line 2721
    .line 2722
    goto :goto_32

    .line 2723
    :cond_56
    instance-of v4, v2, La/lds;

    .line 2724
    .line 2725
    if-eqz v4, :cond_57

    .line 2726
    .line 2727
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 2728
    .line 2729
    check-cast v3, La/lsx;

    .line 2730
    .line 2731
    iget-object v3, v3, La/lsx;->e:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2732
    .line 2733
    check-cast v2, La/lds;

    .line 2734
    .line 2735
    iget-object v2, v2, La/lds;->a:Ljava/lang/String;

    .line 2736
    .line 2737
    const/16 v5, 0xb

    .line 2738
    .line 2739
    const/4 v6, 0x0

    .line 2740
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2741
    .line 2742
    .line 2743
    goto :goto_31

    .line 2744
    :cond_57
    const/16 v5, 0xb

    .line 2745
    .line 2746
    const/4 v6, 0x0

    .line 2747
    instance-of v4, v2, La/tds;

    .line 2748
    .line 2749
    if-eqz v4, :cond_58

    .line 2750
    .line 2751
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 2752
    .line 2753
    check-cast v3, La/lsx;

    .line 2754
    .line 2755
    iget-object v3, v3, La/lsx;->m:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2756
    .line 2757
    check-cast v2, La/tds;

    .line 2758
    .line 2759
    iget-object v2, v2, La/tds;->a:Ljava/lang/String;

    .line 2760
    .line 2761
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2762
    .line 2763
    .line 2764
    goto :goto_31

    .line 2765
    :cond_58
    instance-of v4, v2, La/nds;

    .line 2766
    .line 2767
    if-eqz v4, :cond_59

    .line 2768
    .line 2769
    check-cast v3, La/lsx;

    .line 2770
    .line 2771
    iget-object v3, v3, La/lsx;->f:Landroid/widget/ImageView;

    .line 2772
    .line 2773
    check-cast v2, La/nds;

    .line 2774
    .line 2775
    iget v2, v2, La/nds;->a:I

    .line 2776
    .line 2777
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2778
    .line 2779
    .line 2780
    goto :goto_32

    .line 2781
    :cond_59
    instance-of v4, v2, La/ods;

    .line 2782
    .line 2783
    if-eqz v4, :cond_5a

    .line 2784
    .line 2785
    check-cast v3, La/lsx;

    .line 2786
    .line 2787
    iget-object v3, v3, La/lsx;->h:Landroid/widget/ImageView;

    .line 2788
    .line 2789
    check-cast v2, La/ods;

    .line 2790
    .line 2791
    iget v2, v2, La/ods;->a:I

    .line 2792
    .line 2793
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2794
    .line 2795
    .line 2796
    goto :goto_32

    .line 2797
    :cond_5a
    instance-of v4, v2, La/pds;

    .line 2798
    .line 2799
    if-eqz v4, :cond_5b

    .line 2800
    .line 2801
    check-cast v3, La/lsx;

    .line 2802
    .line 2803
    iget-object v3, v3, La/lsx;->g:Landroid/widget/ImageView;

    .line 2804
    .line 2805
    check-cast v2, La/pds;

    .line 2806
    .line 2807
    iget v2, v2, La/pds;->a:I

    .line 2808
    .line 2809
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2810
    .line 2811
    .line 2812
    goto :goto_32

    .line 2813
    :cond_5b
    instance-of v4, v2, La/qds;

    .line 2814
    .line 2815
    if-eqz v4, :cond_5c

    .line 2816
    .line 2817
    check-cast v3, La/lsx;

    .line 2818
    .line 2819
    iget-object v3, v3, La/lsx;->i:Landroid/widget/ImageView;

    .line 2820
    .line 2821
    check-cast v2, La/qds;

    .line 2822
    .line 2823
    iget v2, v2, La/qds;->a:I

    .line 2824
    .line 2825
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2826
    .line 2827
    .line 2828
    goto/16 :goto_32

    .line 2829
    .line 2830
    :cond_5c
    instance-of v4, v2, La/ids;

    .line 2831
    .line 2832
    if-eqz v4, :cond_5d

    .line 2833
    .line 2834
    check-cast v3, La/lsx;

    .line 2835
    .line 2836
    iget-object v3, v3, La/lsx;->s:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2837
    .line 2838
    check-cast v2, La/ids;

    .line 2839
    .line 2840
    iget-object v2, v2, La/ids;->a:Ljava/lang/String;

    .line 2841
    .line 2842
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2843
    .line 2844
    .line 2845
    goto/16 :goto_32

    .line 2846
    .line 2847
    :cond_5d
    instance-of v4, v2, La/kds;

    .line 2848
    .line 2849
    if-eqz v4, :cond_5e

    .line 2850
    .line 2851
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 2852
    .line 2853
    check-cast v3, La/lsx;

    .line 2854
    .line 2855
    iget-object v3, v3, La/lsx;->b:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2856
    .line 2857
    check-cast v2, La/kds;

    .line 2858
    .line 2859
    iget-object v2, v2, La/kds;->a:Ljava/lang/String;

    .line 2860
    .line 2861
    const/16 v5, 0xb

    .line 2862
    .line 2863
    const/4 v6, 0x0

    .line 2864
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2865
    .line 2866
    .line 2867
    goto/16 :goto_31

    .line 2868
    .line 2869
    :cond_5e
    const/16 v5, 0xb

    .line 2870
    .line 2871
    const/4 v6, 0x0

    .line 2872
    instance-of v4, v2, La/mds;

    .line 2873
    .line 2874
    if-eqz v4, :cond_5f

    .line 2875
    .line 2876
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 2877
    .line 2878
    check-cast v3, La/lsx;

    .line 2879
    .line 2880
    iget-object v3, v3, La/lsx;->j:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2881
    .line 2882
    check-cast v2, La/mds;

    .line 2883
    .line 2884
    iget-object v2, v2, La/mds;->a:Ljava/lang/String;

    .line 2885
    .line 2886
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2887
    .line 2888
    .line 2889
    goto/16 :goto_31

    .line 2890
    .line 2891
    :cond_5f
    instance-of v4, v2, La/sds;

    .line 2892
    .line 2893
    if-eqz v4, :cond_60

    .line 2894
    .line 2895
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 2896
    .line 2897
    check-cast v3, La/lsx;

    .line 2898
    .line 2899
    iget-object v3, v3, La/lsx;->c:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2900
    .line 2901
    check-cast v2, La/sds;

    .line 2902
    .line 2903
    iget-object v2, v2, La/sds;->a:Ljava/lang/String;

    .line 2904
    .line 2905
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2906
    .line 2907
    .line 2908
    goto/16 :goto_31

    .line 2909
    .line 2910
    :cond_60
    instance-of v4, v2, La/uds;

    .line 2911
    .line 2912
    if-eqz v4, :cond_61

    .line 2913
    .line 2914
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 2915
    .line 2916
    check-cast v3, La/lsx;

    .line 2917
    .line 2918
    iget-object v3, v3, La/lsx;->k:Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 2919
    .line 2920
    check-cast v2, La/uds;

    .line 2921
    .line 2922
    iget-object v2, v2, La/uds;->a:Ljava/lang/String;

    .line 2923
    .line 2924
    invoke-static {v3, v2, v6, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2925
    .line 2926
    .line 2927
    goto/16 :goto_31

    .line 2928
    .line 2929
    :cond_61
    invoke-static {}, La/t9f;->b()V

    .line 2930
    .line 2931
    .line 2932
    goto/16 :goto_2e

    .line 2933
    .line 2934
    :cond_62
    :goto_33
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2935
    .line 2936
    :goto_34
    return-object v11

    .line 2937
    :pswitch_1a
    move-object v3, v10

    .line 2938
    move-object/from16 v0, p1

    .line 2939
    .line 2940
    check-cast v0, Ljava/util/List;

    .line 2941
    .line 2942
    iget-object v1, v9, La/cp;->u:La/yfu0;

    .line 2943
    .line 2944
    iget-object v4, v3, La/cp;->u:La/yfu0;

    .line 2945
    .line 2946
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2947
    .line 2948
    .line 2949
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 2950
    .line 2951
    .line 2952
    move-result v5

    .line 2953
    if-eqz v5, :cond_63

    .line 2954
    .line 2955
    move-object v0, v4

    .line 2956
    check-cast v0, La/cs6;

    .line 2957
    .line 2958
    iget-object v0, v0, La/cs6;->d:Landroid/widget/TextView;

    .line 2959
    .line 2960
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2961
    .line 2962
    .line 2963
    move-result-object v1

    .line 2964
    check-cast v1, La/r07;

    .line 2965
    .line 2966
    iget-object v1, v1, La/r07;->b:Ljava/lang/String;

    .line 2967
    .line 2968
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2969
    .line 2970
    .line 2971
    check-cast v4, La/cs6;

    .line 2972
    .line 2973
    iget-object v0, v4, La/cs6;->b:Landroid/widget/ImageView;

    .line 2974
    .line 2975
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2976
    .line 2977
    .line 2978
    move-result-object v0

    .line 2979
    iget-object v1, v4, La/cs6;->b:Landroid/widget/ImageView;

    .line 2980
    .line 2981
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v1

    .line 2985
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2986
    .line 2987
    .line 2988
    const v2, 0x7f0401f1

    .line 2989
    .line 2990
    .line 2991
    invoke-static {v0, v1, v2}, La/vcc;->c0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 2992
    .line 2993
    .line 2994
    iget-object v0, v4, La/cs6;->b:Landroid/widget/ImageView;

    .line 2995
    .line 2996
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 2997
    .line 2998
    .line 2999
    move-result-object v1

    .line 3000
    check-cast v1, La/r07;

    .line 3001
    .line 3002
    iget v1, v1, La/r07;->d:F

    .line 3003
    .line 3004
    invoke-virtual {v0, v1}, Landroid/view/View;->setRotation(F)V

    .line 3005
    .line 3006
    .line 3007
    invoke-static {v3}, La/fre0;->K(La/cp;)V

    .line 3008
    .line 3009
    .line 3010
    goto/16 :goto_37

    .line 3011
    .line 3012
    :cond_63
    new-instance v3, Ljava/util/ArrayList;

    .line 3013
    .line 3014
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 3015
    .line 3016
    .line 3017
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3018
    .line 3019
    .line 3020
    move-result-object v0

    .line 3021
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3022
    .line 3023
    .line 3024
    move-result v4

    .line 3025
    if-eqz v4, :cond_64

    .line 3026
    .line 3027
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3028
    .line 3029
    .line 3030
    move-result-object v4

    .line 3031
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3032
    .line 3033
    .line 3034
    check-cast v4, Ljava/util/Collection;

    .line 3035
    .line 3036
    check-cast v4, Ljava/lang/Iterable;

    .line 3037
    .line 3038
    invoke-static {v3, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 3039
    .line 3040
    .line 3041
    goto :goto_35

    .line 3042
    :cond_64
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3043
    .line 3044
    .line 3045
    move-result-object v0

    .line 3046
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3047
    .line 3048
    .line 3049
    move-result v3

    .line 3050
    if-eqz v3, :cond_68

    .line 3051
    .line 3052
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3053
    .line 3054
    .line 3055
    move-result-object v3

    .line 3056
    check-cast v3, La/q07;

    .line 3057
    .line 3058
    if-eqz v3, :cond_67

    .line 3059
    .line 3060
    instance-of v4, v3, La/p07;

    .line 3061
    .line 3062
    if-eqz v4, :cond_65

    .line 3063
    .line 3064
    move-object v3, v1

    .line 3065
    check-cast v3, La/cs6;

    .line 3066
    .line 3067
    iget-object v3, v3, La/cs6;->b:Landroid/widget/ImageView;

    .line 3068
    .line 3069
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 3070
    .line 3071
    .line 3072
    move-result-object v4

    .line 3073
    check-cast v4, La/r07;

    .line 3074
    .line 3075
    iget v4, v4, La/r07;->d:F

    .line 3076
    .line 3077
    new-array v5, v2, [F

    .line 3078
    .line 3079
    const/16 v17, 0x0

    .line 3080
    .line 3081
    aput v4, v5, v17

    .line 3082
    .line 3083
    const-string v4, "rotation"

    .line 3084
    .line 3085
    invoke-static {v3, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 3086
    .line 3087
    .line 3088
    move-result-object v3

    .line 3089
    const-wide/16 v4, 0x12c

    .line 3090
    .line 3091
    invoke-virtual {v3, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 3092
    .line 3093
    .line 3094
    invoke-virtual {v3}, Landroid/animation/ObjectAnimator;->start()V

    .line 3095
    .line 3096
    .line 3097
    goto :goto_36

    .line 3098
    :cond_65
    const/16 v17, 0x0

    .line 3099
    .line 3100
    instance-of v4, v3, La/o07;

    .line 3101
    .line 3102
    if-eqz v4, :cond_66

    .line 3103
    .line 3104
    invoke-static {v9}, La/fre0;->K(La/cp;)V

    .line 3105
    .line 3106
    .line 3107
    goto :goto_36

    .line 3108
    :cond_66
    instance-of v3, v3, La/n07;

    .line 3109
    .line 3110
    if-eqz v3, :cond_67

    .line 3111
    .line 3112
    move-object v3, v1

    .line 3113
    check-cast v3, La/cs6;

    .line 3114
    .line 3115
    iget-object v3, v3, La/cs6;->d:Landroid/widget/TextView;

    .line 3116
    .line 3117
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 3118
    .line 3119
    .line 3120
    move-result-object v4

    .line 3121
    check-cast v4, La/r07;

    .line 3122
    .line 3123
    iget-object v4, v4, La/r07;->b:Ljava/lang/String;

    .line 3124
    .line 3125
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3126
    .line 3127
    .line 3128
    goto :goto_36

    .line 3129
    :cond_67
    invoke-static {}, La/t9f;->b()V

    .line 3130
    .line 3131
    .line 3132
    const/4 v11, 0x0

    .line 3133
    goto :goto_38

    .line 3134
    :cond_68
    :goto_37
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3135
    .line 3136
    :goto_38
    return-object v11

    .line 3137
    :pswitch_1b
    move-object v3, v10

    .line 3138
    move-object/from16 v0, p1

    .line 3139
    .line 3140
    check-cast v0, Ljava/util/List;

    .line 3141
    .line 3142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3143
    .line 3144
    .line 3145
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3146
    .line 3147
    .line 3148
    move-result v1

    .line 3149
    if-eqz v1, :cond_69

    .line 3150
    .line 3151
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3152
    .line 3153
    .line 3154
    move-result-object v0

    .line 3155
    check-cast v0, La/xx3;

    .line 3156
    .line 3157
    iget-object v1, v3, La/cp;->u:La/yfu0;

    .line 3158
    .line 3159
    check-cast v1, La/bg3;

    .line 3160
    .line 3161
    iget-object v1, v1, La/bg3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3162
    .line 3163
    iget v0, v0, La/xx3;->a:I

    .line 3164
    .line 3165
    invoke-static {v1, v0}, La/vcc;->d0(Landroid/widget/ImageView;I)V

    .line 3166
    .line 3167
    .line 3168
    goto :goto_3b

    .line 3169
    :cond_69
    new-instance v1, Ljava/util/ArrayList;

    .line 3170
    .line 3171
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3172
    .line 3173
    .line 3174
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3175
    .line 3176
    .line 3177
    move-result-object v0

    .line 3178
    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3179
    .line 3180
    .line 3181
    move-result v2

    .line 3182
    if-eqz v2, :cond_6a

    .line 3183
    .line 3184
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3185
    .line 3186
    .line 3187
    move-result-object v2

    .line 3188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3189
    .line 3190
    .line 3191
    check-cast v2, Ljava/util/Collection;

    .line 3192
    .line 3193
    check-cast v2, Ljava/lang/Iterable;

    .line 3194
    .line 3195
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 3196
    .line 3197
    .line 3198
    goto :goto_39

    .line 3199
    :cond_6a
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3200
    .line 3201
    .line 3202
    move-result-object v0

    .line 3203
    :goto_3a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3204
    .line 3205
    .line 3206
    move-result v1

    .line 3207
    if-eqz v1, :cond_6c

    .line 3208
    .line 3209
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3210
    .line 3211
    .line 3212
    move-result-object v1

    .line 3213
    check-cast v1, La/wx3;

    .line 3214
    .line 3215
    if-eqz v1, :cond_6b

    .line 3216
    .line 3217
    invoke-virtual {v9}, La/cp;->u()Ljava/lang/Object;

    .line 3218
    .line 3219
    .line 3220
    move-result-object v1

    .line 3221
    check-cast v1, La/xx3;

    .line 3222
    .line 3223
    iget-object v2, v9, La/cp;->u:La/yfu0;

    .line 3224
    .line 3225
    check-cast v2, La/bg3;

    .line 3226
    .line 3227
    iget-object v2, v2, La/bg3;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3228
    .line 3229
    iget v1, v1, La/xx3;->a:I

    .line 3230
    .line 3231
    invoke-static {v2, v1}, La/vcc;->d0(Landroid/widget/ImageView;I)V

    .line 3232
    .line 3233
    .line 3234
    goto :goto_3a

    .line 3235
    :cond_6b
    invoke-static {}, La/t9f;->b()V

    .line 3236
    .line 3237
    .line 3238
    const/4 v11, 0x0

    .line 3239
    goto :goto_3c

    .line 3240
    :cond_6c
    :goto_3b
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3241
    .line 3242
    :goto_3c
    return-object v11

    .line 3243
    :pswitch_1c
    move-object v3, v10

    .line 3244
    move-object/from16 v0, p1

    .line 3245
    .line 3246
    check-cast v0, Ljava/util/List;

    .line 3247
    .line 3248
    iget-object v1, v3, La/cp;->u:La/yfu0;

    .line 3249
    .line 3250
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3251
    .line 3252
    .line 3253
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 3254
    .line 3255
    .line 3256
    move-result v2

    .line 3257
    if-eqz v2, :cond_6d

    .line 3258
    .line 3259
    move-object v0, v1

    .line 3260
    check-cast v0, La/urx;

    .line 3261
    .line 3262
    iget-object v0, v0, La/urx;->b:Landroid/widget/ImageView;

    .line 3263
    .line 3264
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3265
    .line 3266
    .line 3267
    move-result-object v2

    .line 3268
    check-cast v2, La/nk;

    .line 3269
    .line 3270
    invoke-virtual {v2}, La/nk;->b()I

    .line 3271
    .line 3272
    .line 3273
    move-result v2

    .line 3274
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3275
    .line 3276
    .line 3277
    check-cast v1, La/urx;

    .line 3278
    .line 3279
    iget-object v0, v1, La/urx;->c:Landroid/widget/TextView;

    .line 3280
    .line 3281
    invoke-virtual {v3}, La/cp;->u()Ljava/lang/Object;

    .line 3282
    .line 3283
    .line 3284
    move-result-object v1

    .line 3285
    check-cast v1, La/nk;

    .line 3286
    .line 3287
    invoke-virtual {v1}, La/nk;->a()Ljava/lang/String;

    .line 3288
    .line 3289
    .line 3290
    move-result-object v1

    .line 3291
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3292
    .line 3293
    .line 3294
    goto :goto_3f

    .line 3295
    :cond_6d
    new-instance v1, Ljava/util/ArrayList;

    .line 3296
    .line 3297
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3298
    .line 3299
    .line 3300
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3301
    .line 3302
    .line 3303
    move-result-object v0

    .line 3304
    :goto_3d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3305
    .line 3306
    .line 3307
    move-result v2

    .line 3308
    if-eqz v2, :cond_6e

    .line 3309
    .line 3310
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3311
    .line 3312
    .line 3313
    move-result-object v2

    .line 3314
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3315
    .line 3316
    .line 3317
    check-cast v2, Ljava/util/Collection;

    .line 3318
    .line 3319
    check-cast v2, Ljava/lang/Iterable;

    .line 3320
    .line 3321
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 3322
    .line 3323
    .line 3324
    goto :goto_3d

    .line 3325
    :cond_6e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3326
    .line 3327
    .line 3328
    move-result-object v0

    .line 3329
    :goto_3e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 3330
    .line 3331
    .line 3332
    move-result v1

    .line 3333
    if-eqz v1, :cond_71

    .line 3334
    .line 3335
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3336
    .line 3337
    .line 3338
    move-result-object v1

    .line 3339
    check-cast v1, La/ik;

    .line 3340
    .line 3341
    iget-object v2, v9, La/cp;->u:La/yfu0;

    .line 3342
    .line 3343
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3344
    .line 3345
    .line 3346
    instance-of v3, v1, La/gk;

    .line 3347
    .line 3348
    if-eqz v3, :cond_6f

    .line 3349
    .line 3350
    check-cast v2, La/urx;

    .line 3351
    .line 3352
    iget-object v2, v2, La/urx;->c:Landroid/widget/TextView;

    .line 3353
    .line 3354
    check-cast v1, La/gk;

    .line 3355
    .line 3356
    iget-object v1, v1, La/gk;->a:Ljava/lang/String;

    .line 3357
    .line 3358
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 3359
    .line 3360
    .line 3361
    goto :goto_3e

    .line 3362
    :cond_6f
    instance-of v3, v1, La/hk;

    .line 3363
    .line 3364
    if-eqz v3, :cond_70

    .line 3365
    .line 3366
    check-cast v2, La/urx;

    .line 3367
    .line 3368
    iget-object v2, v2, La/urx;->b:Landroid/widget/ImageView;

    .line 3369
    .line 3370
    check-cast v1, La/hk;

    .line 3371
    .line 3372
    iget v1, v1, La/hk;->a:I

    .line 3373
    .line 3374
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 3375
    .line 3376
    .line 3377
    goto :goto_3e

    .line 3378
    :cond_70
    invoke-static {}, La/t9f;->b()V

    .line 3379
    .line 3380
    .line 3381
    const/4 v11, 0x0

    .line 3382
    goto :goto_40

    .line 3383
    :cond_71
    :goto_3f
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3384
    .line 3385
    :goto_40
    return-object v11

    .line 3386
    nop

    .line 3387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
