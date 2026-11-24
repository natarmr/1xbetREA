.class public final synthetic La/o0m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t0m0;


# direct methods
.method public synthetic constructor <init>(La/t0m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o0m0;->a:B

    iput-object p1, p0, La/o0m0;->b:La/t0m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/o0m0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/o0m0;->b:La/t0m0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/t0m0;->Z1:La/gne0;

    .line 10
    .line 11
    iget-object p0, p0, La/t0m0;->S1:La/fiu0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "viewModelFactory"

    .line 17
    .line 18
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v1

    .line 22
    :pswitch_0
    sget-object v0, La/t0m0;->Z1:La/gne0;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    instance-of v2, v0, La/af3;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v0, La/af3;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move-object v0, v1

    .line 43
    :goto_0
    const-class v2, La/hgp0;

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/o5d0;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/ze3;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move-object v0, v1

    .line 67
    :goto_1
    instance-of v3, v0, La/hgp0;

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    move-object v0, v1

    .line 72
    :cond_3
    move-object v3, v0

    .line 73
    check-cast v3, La/hgp0;

    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iget-object v0, p0, La/t0m0;->K1:La/khf0;

    .line 82
    .line 83
    sget-object v1, La/t0m0;->a2:[La/iiy;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    aget-object v2, v1, v2

    .line 87
    .line 88
    invoke-virtual {v0, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v5, v0

    .line 93
    check-cast v5, Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    .line 94
    .line 95
    iget-object v0, p0, La/t0m0;->L1:La/r34;

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    aget-object v2, v1, v2

    .line 99
    .line 100
    invoke-virtual {v0, p0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    iget-object v0, p0, La/t0m0;->M1:La/r34;

    .line 109
    .line 110
    const/4 v2, 0x2

    .line 111
    aget-object v2, v1, v2

    .line 112
    .line 113
    invoke-virtual {v0, p0, v2}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v8

    .line 121
    iget-object v0, p0, La/t0m0;->N1:La/r34;

    .line 122
    .line 123
    const/4 v2, 0x3

    .line 124
    aget-object v1, v1, v2

    .line 125
    .line 126
    invoke-virtual {v0, p0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide v10

    .line 134
    invoke-virtual/range {v3 .. v11}, La/hgp0;->a(La/i1w0;Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)La/mwi;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    goto :goto_2

    .line 139
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 140
    .line 141
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    return-object v1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
