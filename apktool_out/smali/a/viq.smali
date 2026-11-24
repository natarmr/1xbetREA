.class public final synthetic La/viq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b28;
.implements La/lzw;
.implements La/ikf0;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements La/k4r;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements La/zon0;
.implements La/hbj;
.implements La/nh60;
.implements La/zy3;
.implements La/eer;
.implements La/diq;
.implements La/d1x;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/viq;->a:B

    iput-object p1, p0, La/viq;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 8

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ajq;

    .line 4
    .line 5
    iget v0, p0, La/ajq;->e:I

    .line 6
    .line 7
    int-to-long v0, v0

    .line 8
    mul-long/2addr p1, v0

    .line 9
    const-wide/32 v0, 0xf4240

    .line 10
    .line 11
    .line 12
    div-long v2, p1, v0

    .line 13
    .line 14
    iget-wide p0, p0, La/ajq;->j:J

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    sub-long v6, p0, v0

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    invoke-static/range {v2 .. v7}, La/vtt0;->j(JJJ)J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0
.end method

.method public apply(Ljava/lang/Object;)La/ig00;
    .locals 0

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ebz;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/ebz;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ig00;

    .line 10
    .line 11
    return-object p0
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    check-cast p0, La/k9v;

    .line 12
    invoke-virtual {p0, p1}, La/k9v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Void;

    return-object p0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/viq;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/ik30;

    .line 9
    .line 10
    sget-object v0, La/ik30;->W1:La/atz;

    .line 11
    .line 12
    invoke-virtual {p0}, La/ik30;->H0()La/zk30;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, La/zk30;->w(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    check-cast p0, La/izv;

    .line 22
    .line 23
    sget-object v0, La/izv;->d2:La/rqt;

    .line 24
    .line 25
    invoke-virtual {p0}, La/izv;->M0()La/jzv;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v0, 0x0

    .line 30
    iget-object p0, p0, La/jzv;->c:La/r2w;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, La/r2w;->C(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public c(F)V
    .locals 2

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xm30;

    .line 4
    .line 5
    iget-object v0, p0, La/xm30;->p2:La/ueu0;

    .line 6
    .line 7
    iget-object v0, v0, La/ueu0;->b:La/zeu0;

    .line 8
    .line 9
    iget v1, v0, La/zeu0;->f:F

    .line 10
    .line 11
    cmpl-float v1, v1, p1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput p1, v0, La/zeu0;->f:F

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {v0, p1}, La/zeu0;->c(Z)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, La/mm30;->n1:Landroidx/media3/common/b;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/mm30;->D0(Landroidx/media3/common/b;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public d()La/jbj;
    .locals 0

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/psc;

    .line 4
    .line 5
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hbj;

    .line 8
    .line 9
    invoke-interface {p0}, La/hbj;->d()La/jbj;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public e(La/e1x;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ld40;

    .line 4
    .line 5
    iget-object v0, p0, La/ld40;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget v1, p0, La/ld40;->c:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    iput v1, p0, La/ld40;->c:I

    .line 13
    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-virtual {p0, p1}, La/ld40;->e(La/e1x;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p0
.end method

.method public f(JLa/fq80;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/x6r;

    .line 4
    .line 5
    iget-object p0, p0, La/x6r;->J:[La/ncs0;

    .line 6
    .line 7
    invoke-static {p1, p2, p3, p0}, La/nnw0;->D(JLa/fq80;[La/ncs0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/odd;

    .line 4
    .line 5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/pby;->N(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(La/hnu;ILandroid/os/Bundle;)Z
    .locals 6

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/AppCompatEditText;

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x19

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-lt v0, v1, :cond_1

    .line 12
    .line 13
    and-int/2addr p2, v3

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    :try_start_0
    iget-object p2, p1, La/hnu;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, La/oex;

    .line 19
    .line 20
    invoke-interface {p2}, La/oex;->m()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    iget-object p2, p1, La/hnu;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, La/oex;

    .line 26
    .line 27
    invoke-interface {p2}, La/oex;->h()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p2, Landroid/os/Parcelable;

    .line 32
    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    new-instance p3, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    move-object p3, v1

    .line 47
    :goto_0
    const-string v1, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    .line 48
    .line 49
    invoke-virtual {p3, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p0

    .line 54
    const-string p1, "InputConnectionCompat"

    .line 55
    .line 56
    const-string p2, "Can\'t insert content from IME; requestPermission() failed"

    .line 57
    .line 58
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 59
    .line 60
    .line 61
    return v2

    .line 62
    :cond_1
    :goto_1
    new-instance p2, Landroid/content/ClipData;

    .line 63
    .line 64
    iget-object p1, p1, La/hnu;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/oex;

    .line 67
    .line 68
    invoke-interface {p1}, La/oex;->getDescription()Landroid/content/ClipDescription;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v4, Landroid/content/ClipData$Item;

    .line 73
    .line 74
    invoke-interface {p1}, La/oex;->l()Landroid/net/Uri;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-direct {v4, v5}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, v1, v4}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0x1f

    .line 85
    .line 86
    const/4 v4, 0x2

    .line 87
    if-lt v0, v1, :cond_2

    .line 88
    .line 89
    new-instance v0, La/prc;

    .line 90
    .line 91
    invoke-direct {v0, p2, v4}, La/prc;-><init>(Landroid/content/ClipData;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    new-instance v0, La/pee;

    .line 96
    .line 97
    invoke-direct {v0}, La/pee;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p2, v0, La/pee;->b:Landroid/content/ClipData;

    .line 101
    .line 102
    iput-byte v4, v0, La/pee;->c:B

    .line 103
    .line 104
    :goto_2
    invoke-interface {p1}, La/oex;->o()Landroid/net/Uri;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {v0, p1}, La/oee;->d(Landroid/net/Uri;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, p3}, La/oee;->setExtras(Landroid/os/Bundle;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, La/oee;->build()La/ree;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p0, p1}, La/rgu0;->k(Landroidx/appcompat/widget/AppCompatEditText;La/ree;)La/ree;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    if-nez p0, :cond_3

    .line 123
    .line 124
    return v3

    .line 125
    :cond_3
    return v2
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 12

    .line 1
    iget-byte v0, p0, La/viq;->a:B

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "RESULT_POSITION"

    .line 7
    .line 8
    const-string v4, "SELECT_BALANCE_REQUEST_KEY"

    .line 9
    .line 10
    const-string v5, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 11
    .line 12
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 13
    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, La/xt60;

    .line 18
    .line 19
    sget-object v0, La/xt60;->V1:La/xuz;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p1, La/ql5;

    .line 45
    .line 46
    invoke-virtual {p0}, La/xt60;->G0()La/k3t0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance p2, La/gt60;

    .line 51
    .line 52
    invoke-direct {p2, p1}, La/gt60;-><init>(La/ql5;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    return-void

    .line 59
    :sswitch_0
    check-cast p0, La/gs60;

    .line 60
    .line 61
    sget-object v0, La/gs60;->R1:La/uuz;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-nez p2, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast p1, La/ql5;

    .line 87
    .line 88
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p2, La/sp60;

    .line 93
    .line 94
    invoke-direct {p2, p1}, La/sp60;-><init>(La/ql5;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_1
    return-void

    .line 101
    :sswitch_1
    check-cast p0, La/lo60;

    .line 102
    .line 103
    sget-object v0, La/lo60;->U1:La/htz;

    .line 104
    .line 105
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string v0, "GameIsNotFinishedDialog.REQUEST_KEY"

    .line 109
    .line 110
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-nez p2, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    const-string p2, "GameIsNotFinishedDialog.RESULT_KEY_CONTINUE"

    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    const-string v1, "SHOW_GAME_IS_NOT_FINISHED_DIALOG"

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    invoke-virtual {p0}, La/lo60;->H0()La/sp70;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p0, p0, La/sp70;->t:La/xsi0;

    .line 136
    .line 137
    xor-int/lit8 p1, p1, 0x1

    .line 138
    .line 139
    iget-object p0, p0, La/xsi0;->a:La/pbt;

    .line 140
    .line 141
    iget-object p0, p0, La/pbt;->b:La/lsn;

    .line 142
    .line 143
    iget-object p0, p0, La/lsn;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, Landroid/content/SharedPreferences;

    .line 146
    .line 147
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-interface {p0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    const-string p2, "GameIsNotFinishedDialog.RESULT_KEY_EXIT"

    .line 160
    .line 161
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_6

    .line 166
    .line 167
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    invoke-virtual {p0}, La/lo60;->H0()La/sp70;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    iget-object p2, p0, La/sp70;->t:La/xsi0;

    .line 176
    .line 177
    xor-int/lit8 p1, p1, 0x1

    .line 178
    .line 179
    iget-object p2, p2, La/xsi0;->a:La/pbt;

    .line 180
    .line 181
    iget-object p2, p2, La/pbt;->b:La/lsn;

    .line 182
    .line 183
    iget-object p2, p2, La/lsn;->a:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p2, Landroid/content/SharedPreferences;

    .line 186
    .line 187
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-interface {p2, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 196
    .line 197
    .line 198
    new-instance p1, La/iy5;

    .line 199
    .line 200
    sget-object p2, La/csr;->e:La/csr;

    .line 201
    .line 202
    invoke-direct {p1, p2}, La/iy5;-><init>(La/csr;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/sp70;->w(La/zy5;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0}, La/sp70;->B()V

    .line 209
    .line 210
    .line 211
    :cond_6
    :goto_2
    return-void

    .line 212
    :sswitch_2
    check-cast p0, La/b160;

    .line 213
    .line 214
    sget-object p1, La/b160;->O1:La/evz;

    .line 215
    .line 216
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, La/b160;->H0()La/k3t0;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    sget-object p1, La/iy50;->a:La/iy50;

    .line 224
    .line 225
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :sswitch_3
    check-cast p0, La/f840;

    .line 230
    .line 231
    sget-object p1, La/f840;->O1:La/atz;

    .line 232
    .line 233
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, La/f840;->H0()La/k3t0;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    sget-object p1, La/s740;->a:La/s740;

    .line 241
    .line 242
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :sswitch_4
    check-cast p0, La/b920;

    .line 247
    .line 248
    sget-object v0, La/b920;->U1:La/htz;

    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    invoke-virtual {p0}, La/b920;->J0()La/k3t0;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    new-instance p2, La/a520;

    .line 262
    .line 263
    invoke-direct {p2, p1}, La/a520;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :sswitch_5
    check-cast p0, La/i820;

    .line 271
    .line 272
    sget-object v0, La/i820;->U1:La/atz;

    .line 273
    .line 274
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result p1

    .line 281
    invoke-virtual {p0}, La/i820;->H0()La/wze;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    new-instance v3, La/z6e;

    .line 290
    .line 291
    const/4 v9, 0x0

    .line 292
    const/16 v10, 0x18

    .line 293
    .line 294
    const/4 v4, 0x1

    .line 295
    const-class v6, La/wze;

    .line 296
    .line 297
    const-string v7, "handleError"

    .line 298
    .line 299
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 300
    .line 301
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 302
    .line 303
    .line 304
    iget-object p2, v5, La/wze;->o:La/mne;

    .line 305
    .line 306
    iget-object v9, p2, La/mne;->b:La/dvj;

    .line 307
    .line 308
    new-instance v10, La/bh0;

    .line 309
    .line 310
    const/16 p2, 0x8

    .line 311
    .line 312
    invoke-direct {v10, v5, p1, v2, p2}, La/bh0;-><init>(La/diu0;ILa/yje;B)V

    .line 313
    .line 314
    .line 315
    const/16 v11, 0xa

    .line 316
    .line 317
    const/4 v8, 0x0

    .line 318
    move-object v6, p0

    .line 319
    move-object v7, v3

    .line 320
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :sswitch_6
    check-cast p0, La/ce00;

    .line 325
    .line 326
    sget-object p1, La/ce00;->P1:La/wsz;

    .line 327
    .line 328
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-virtual {p0}, La/ce00;->H0()La/ef00;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    invoke-virtual {p0}, La/ef00;->y()V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :sswitch_7
    check-cast p0, La/eyz;

    .line 340
    .line 341
    sget-object v0, La/eyz;->O1:La/evz;

    .line 342
    .line 343
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    const-string v0, "REQUEST_SET_LIMIT_KEY"

    .line 347
    .line 348
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result p2

    .line 352
    if-nez p2, :cond_7

    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_7
    const-string p2, "NEW_LIMIT_RESULT"

    .line 356
    .line 357
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    if-eqz v0, :cond_9

    .line 362
    .line 363
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    if-nez p1, :cond_8

    .line 368
    .line 369
    goto :goto_3

    .line 370
    :cond_8
    invoke-virtual {p0}, La/eyz;->G0()La/k3t0;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    new-instance p2, La/kxz;

    .line 375
    .line 376
    invoke-direct {p2, p1}, La/kxz;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    :cond_9
    :goto_3
    return-void

    .line 383
    :sswitch_8
    check-cast p0, La/s0z;

    .line 384
    .line 385
    sget-object v0, La/s0z;->U1:La/bst;

    .line 386
    .line 387
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 391
    .line 392
    if-lt p2, v1, :cond_a

    .line 393
    .line 394
    invoke-static {p1}, La/r6e;->j(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    goto :goto_5

    .line 399
    :cond_a
    const-string p2, "REQUEST_SELECT_FILTER_MODEL"

    .line 400
    .line 401
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    instance-of p2, p1, La/n3q;

    .line 406
    .line 407
    if-nez p2, :cond_b

    .line 408
    .line 409
    goto :goto_4

    .line 410
    :cond_b
    move-object v2, p1

    .line 411
    :goto_4
    move-object p1, v2

    .line 412
    check-cast p1, La/n3q;

    .line 413
    .line 414
    :goto_5
    check-cast p1, La/n3q;

    .line 415
    .line 416
    if-eqz p1, :cond_c

    .line 417
    .line 418
    iget-object p0, p0, La/s0z;->S1:La/a8z;

    .line 419
    .line 420
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    check-cast p0, La/k3t0;

    .line 425
    .line 426
    new-instance p2, La/f0z;

    .line 427
    .line 428
    invoke-direct {p2, p1}, La/f0z;-><init>(La/n3q;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    :cond_c
    return-void

    .line 435
    :sswitch_9
    check-cast p0, La/ddv;

    .line 436
    .line 437
    sget-object v0, La/ddv;->Q1:La/art;

    .line 438
    .line 439
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    const-string v0, "REQUEST_SELECT_SEASON_FILTER_DIALOG_KEY"

    .line 443
    .line 444
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result p2

    .line 448
    if-nez p2, :cond_d

    .line 449
    .line 450
    goto :goto_7

    .line 451
    :cond_d
    invoke-virtual {p1, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 452
    .line 453
    .line 454
    move-result p2

    .line 455
    if-eqz p2, :cond_f

    .line 456
    .line 457
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 458
    .line 459
    if-gt p2, v1, :cond_e

    .line 460
    .line 461
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    goto :goto_6

    .line 466
    :cond_e
    invoke-static {p1}, La/r6e;->C(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    check-cast p1, Landroid/os/Parcelable;

    .line 471
    .line 472
    :goto_6
    check-cast p1, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;

    .line 473
    .line 474
    if-eqz p1, :cond_f

    .line 475
    .line 476
    iget-object p0, p0, La/ddv;->O1:La/a8z;

    .line 477
    .line 478
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    check-cast p0, La/k3t0;

    .line 483
    .line 484
    new-instance p2, La/xcv;

    .line 485
    .line 486
    iget-object p1, p1, Lorg/xplatform/statistic/grand_prix/presentation/model/SeasonItemUIModel;->a:Ljava/lang/String;

    .line 487
    .line 488
    invoke-direct {p2, p1}, La/xcv;-><init>(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    :cond_f
    :goto_7
    return-void

    .line 495
    :sswitch_a
    check-cast p0, La/g8v;

    .line 496
    .line 497
    sget-object p1, La/g8v;->P1:La/rqt;

    .line 498
    .line 499
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    const-string p1, "X_GAMES_UM_BUTTON_CLICK_RESULT_KEY"

    .line 503
    .line 504
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result p1

    .line 508
    if-nez p1, :cond_10

    .line 509
    .line 510
    goto :goto_8

    .line 511
    :cond_10
    invoke-virtual {p0}, La/g8v;->I0()La/k3t0;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    sget-object p1, La/d8v;->a:La/d8v;

    .line 516
    .line 517
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    :goto_8
    return-void

    .line 521
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_a
        0x7 -> :sswitch_9
        0xc -> :sswitch_8
        0xf -> :sswitch_7
        0x10 -> :sswitch_6
        0x11 -> :sswitch_5
        0x12 -> :sswitch_4
        0x16 -> :sswitch_3
        0x19 -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/viq;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/nvu;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Void;

    .line 11
    .line 12
    new-instance p1, La/md3;

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    invoke-direct {p1, p0, v0}, La/md3;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/nvu;->d:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, Landroid/content/IntentFilter;

    .line 21
    .line 22
    const-string v0, "com.huawei.hms.auth.api.phone.SMS_RETRIEVED"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, La/nvu;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, La/us00;

    .line 30
    .line 31
    iget-object p0, p0, La/nvu;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/md3;

    .line 34
    .line 35
    invoke-static {v0, p0, p1}, La/jiq0;->t0(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :sswitch_0
    check-cast p0, La/t3t;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/t3t;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_1
    check-cast p0, La/enm;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, La/enm;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/viq;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/a6u;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "FID_ALREADY_USED:"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const-string p1, "FirebaseMessaging"

    .line 44
    .line 45
    const-string v0, "FID_ALREADY_USED Detected. Retrying with FID cache clearing!"

    .line 46
    .line 47
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/a6u;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, La/dgq;

    .line 53
    .line 54
    check-cast p1, La/cgq;

    .line 55
    .line 56
    iget-object p1, p1, La/cgq;->c:La/g090;

    .line 57
    .line 58
    invoke-virtual {p1}, La/g090;->g()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/a6u;->L()Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    :cond_1
    :goto_0
    return-object p1
.end method
