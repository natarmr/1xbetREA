.class public final synthetic La/dgb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hgb;


# direct methods
.method public synthetic constructor <init>(La/hgb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dgb;->a:B

    iput-object p1, p0, La/dgb;->b:La/hgb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/dgb;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/dgb;->b:La/hgb;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/hgb;->c2:La/kl5;

    .line 10
    .line 11
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, La/jgb;->z()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    sget-object v0, La/hgb;->c2:La/kl5;

    .line 22
    .line 23
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, La/jgb;->y()V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_1
    sget-object v0, La/hgb;->c2:La/kl5;

    .line 34
    .line 35
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, La/jgb;->w()V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    sget-object v0, La/hgb;->c2:La/kl5;

    .line 46
    .line 47
    invoke-virtual {p0}, La/hgb;->H0()La/jgb;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, La/jgb;->w()V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_3
    sget-object v0, La/hgb;->c2:La/kl5;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    instance-of v2, v0, La/af3;

    .line 71
    .line 72
    if-eqz v2, :cond_0

    .line 73
    .line 74
    check-cast v0, La/af3;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    move-object v0, v1

    .line 78
    :goto_0
    const-class v2, La/hgp0;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/o5d0;

    .line 91
    .line 92
    if-eqz v0, :cond_1

    .line 93
    .line 94
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, La/ze3;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move-object v0, v1

    .line 102
    :goto_1
    instance-of v3, v0, La/hgp0;

    .line 103
    .line 104
    if-nez v3, :cond_2

    .line 105
    .line 106
    move-object v0, v1

    .line 107
    :cond_2
    move-object v3, v0

    .line 108
    check-cast v3, La/hgp0;

    .line 109
    .line 110
    if-eqz v3, :cond_3

    .line 111
    .line 112
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iget-object v0, p0, La/hgb;->O1:La/khf0;

    .line 117
    .line 118
    sget-object v1, La/hgb;->d2:[La/iiy;

    .line 119
    .line 120
    const/4 v2, 0x1

    .line 121
    aget-object v2, v1, v2

    .line 122
    .line 123
    invoke-virtual {v0, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    move-object v5, v0

    .line 128
    check-cast v5, Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    .line 129
    .line 130
    iget-object v0, p0, La/hgb;->N1:La/r34;

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    aget-object v1, v1, v2

    .line 134
    .line 135
    invoke-virtual {v0, p0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    const-wide/16 v8, -0x1

    .line 144
    .line 145
    const-wide/16 v10, 0x0

    .line 146
    .line 147
    invoke-virtual/range {v3 .. v11}, La/hgp0;->a(La/i1w0;Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)La/mwi;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    goto :goto_2

    .line 152
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 153
    .line 154
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :goto_2
    return-object v1

    .line 162
    :pswitch_4
    iget-object p0, p0, La/hgb;->Q1:La/fiu0;

    .line 163
    .line 164
    if-eqz p0, :cond_4

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_4
    const-string p0, "viewModelFactory"

    .line 168
    .line 169
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw v1

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
